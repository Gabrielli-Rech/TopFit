package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Exercicios;
public class ExerciciosDAO {
public void cadastrarExercicios(Exercicios eVO) {
        try {
            Connection con = Conexao.getConexao();

            String sql = "Insert into academia values ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, eVO.getNome());
            pst.setString(2, eVO.getExercicios());
            pst.setString(3, eVO.getSeries_e_Repeticoes());
            pst.setInt(4, eVO.getId());
            pst.execute();
            System.out.println("Exercicios cadastrado com sucesso! ");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Exercicios: " + e.getMessage());
        }
    }

    public ArrayList<Exercicios> listarExercicioss() {
        ArrayList<Exercicios> ins = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where CertificadoExercicios is not null";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Exercicios Exercicios = new Exercicios();
                Exercicios.setId(rs.getInt("id"));
                Exercicios.setNome(rs.getString("nome"));
                Exercicios.setSeries_e_Repeticoes(rs.getString("Series_e_Repeticoes"));
                Exercicios.setExercicios(rs.getString("Exercicios"));
                ins.add(Exercicios);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar Exercicios: \n" + e.getMessage());
        }
        return ins;
    }

    public Exercicios buscarExerciciosPorNome(String nome) {
        Exercicios Exercicios = new Exercicios();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "%" + nome + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Exercicios.setId(rs.getInt("id"));
                Exercicios.setNome(rs.getString("nome"));
                Exercicios.setSeries_e_Repeticoes(rs.getString("Series_e_Repeticoes"));
                Exercicios.setExercicios(rs.getString("Exercicios"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar exercicios por nome: \n" + e.getMessage());
        }
        return Exercicios;
    }

    public Exercicios buscarExerciciosPorId(int id) {
        Exercicios Exercicios = new Exercicios();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Exercicios.setId(rs.getInt("id"));
                Exercicios.setNome(rs.getString("nome"));
                Exercicios.setSeries_e_Repeticoes(rs.getString("Series_e_Repeticoes"));
                Exercicios.setExercicios(rs.getString("Exercicios"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Exercicios por ID: \n" + e.getMessage());
        }
        return Exercicios;
    }

    public void atualizarExercicios(Exercicios aVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update academia set Exercicios = ? where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getExercicios());
            pst.setInt(2, aVO.getId());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Exercicios: \n" + e.getMessage());
        }
    }

    public boolean deletarExercicios(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from academia where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (Exception e) {
            System.out.println("Erro ao deletar Exercicios: \n" + e.getMessage());
        }
        return false;
    }
}
