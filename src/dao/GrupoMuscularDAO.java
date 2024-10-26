package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.GrupoMuscular;

public class GrupoMuscularDAO {
public void cadastrarGrupoMuscular(GrupoMuscular gmVO) {
        try {
            Connection con = Conexao.getConexao();

            String sql = "Insert into academia values ( ?,?,null,null,null,null,null,null,null,null,null,?,?,?,?,?,?,?,?,?,?,null,null)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, gmVO.getId());
            pst.setString(2, gmVO.getNome());
            pst.setString(3, gmVO.getTorax());
            pst.setString(4, gmVO.getOmbro());
            pst.setString(5, gmVO.getTriceps());
            pst.setString(6, gmVO.getCostas());
            pst.setString(7, gmVO.getAbdomem());
            pst.setString(8, gmVO.getBiceps());
            pst.setString(9, gmVO.getPernas());
            pst.setString(10, gmVO.getGluteo());
            pst.execute();
            System.out.println("Grupo muscular cadastrado com sucesso! ");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar grupo muscular: " + e.getMessage());
        }
    }

    public ArrayList<GrupoMuscular> listarGrupoMusculars() {
        ArrayList<GrupoMuscular> ins = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where Abdomem is not null";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                GrupoMuscular GrupoMuscular = new GrupoMuscular();
                GrupoMuscular.setId(rs.getInt("id"));
                GrupoMuscular.setNome(rs.getString("nome"));
                GrupoMuscular.setOmbro(rs.getString("Ombro"));
                GrupoMuscular.setTorax(rs.getString("Torax"));
                GrupoMuscular.setTriceps(rs.getString("Triceps"));
                GrupoMuscular.setAbdomem(rs.getString("Abdomem"));
                GrupoMuscular.setCostas(rs.getString("Costas"));
                ins.add(GrupoMuscular);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar grupo muscular: \n" + e.getMessage());
        }
        return ins;
    }

    public GrupoMuscular buscarGrupoMuscularPorNome(String nome) {
        GrupoMuscular GrupoMuscular = new GrupoMuscular();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "%" + nome + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                GrupoMuscular.setId(rs.getInt("id"));
                GrupoMuscular.setNome(rs.getString("nome"));
                GrupoMuscular.setOmbro(rs.getString("Ombro"));
                GrupoMuscular.setTorax(rs.getString("Torax"));
                GrupoMuscular.setTriceps(rs.getString("Triceps"));
                GrupoMuscular.setAbdomem(rs.getString("Abdomem"));
                GrupoMuscular.setCostas(rs.getString("Costas"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar grupo muscular por nome: \n" + e.getMessage());
        }
        return GrupoMuscular;
    }

    public GrupoMuscular buscarGrupoMuscularPorId(int id) {
        GrupoMuscular GrupoMuscular = new GrupoMuscular();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                GrupoMuscular.setId(rs.getInt("id"));
                GrupoMuscular.setNome(rs.getString("nome"));
                GrupoMuscular.setOmbro(rs.getString("Ombro"));
                GrupoMuscular.setTorax(rs.getString("Torax"));
                GrupoMuscular.setTriceps(rs.getString("Triceps"));
                GrupoMuscular.setAbdomem(rs.getString("Abdomem"));
                GrupoMuscular.setCostas(rs.getString("Costas"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar grupo muscular por ID: \n" + e.getMessage());
        }
        return GrupoMuscular;
    }

    public void atualizarGrupoMuscular(GrupoMuscular aVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update academia set where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, aVO.getId());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar grupo muscular: \n" + e.getMessage());
        }
    }

    public boolean deletarGrupoMuscular(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from academia where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (Exception e) {
            System.out.println("Erro ao deletar grupo muscular: \n" + e.getMessage());
        }
        return false;
    }
}
