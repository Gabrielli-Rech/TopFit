package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Treino;

public class TreinoDAO {
    public Treino cadastrarTreino(Treino t2) {
        Treino t = new Treino();
        try (Connection con = Conexao.getConexao()) {
            String sql = "INSERT INTO Treino (nome, id, inferior, superior) VALUES (?,?,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,?,?,null,null,null)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t2.getNome());
            pst.setInt(2, t2.getId());
            pst.setString(3, t2.getInferior());
            pst.setString(4, t2.getSuperior());
            pst.setString(5, t2.getExercicios());
            pst.setString(6, t2.getSeries_e_Repeticoes());
            pst.executeUpdate();
            System.out.println("Treino cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Treino: " + e.getMessage());
        }
        return t;
    }

    public ArrayList<Treino> listarTreinos() {
        ArrayList<Treino> treinos = new ArrayList<>();
        try (Connection con = Conexao.getConexao()) {
            String sql = "SELECT * FROM Treino WHERE matricula IS NOT NULL";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Treino treino = new Treino();
                treino.setId(rs.getInt("id"));
                treino.setNome(rs.getString("nome"));
                treino.setSuperior(rs.getString("inferior"));
                treino.setInferior(rs.getString("superior"));
                treinos.add(treino);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar treinos: " + e.getMessage());
        }
        return treinos;
    }

    public Treino getTreinoByNome(String nome) {
        Treino t = null;
        try (Connection con = Conexao.getConexao()) {
            String sql = "SELECT * FROM Treino WHERE nome LIKE ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                t = new Treino();
                t.setId(rs.getInt("id"));
                t.setNome(rs.getString("nome"));
                t.setSuperior(rs.getString("inferior"));
                t.setInferior(rs.getString("superior"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Treino: " + e.getMessage());
        }
        return t;
    }

    public Treino getTreinoById(int id) {
        Treino t = null;
        try (Connection con = Conexao.getConexao()) {
            String sql = "SELECT * FROM Treino WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                t = new Treino();
                t.setId(rs.getInt("id"));
                t.setNome(rs.getString("nome"));
                t.setSuperior(rs.getString("inferior"));
                t.setInferior(rs.getString("superior"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Treino: " + e.getMessage());
        }
        return t;
    }

    public void atualizarTreino(Treino tUP) {
        try (Connection con = Conexao.getConexao()) {
            String sql = "UPDATE Treino SET inferior = ?, superior = ? WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tUP.getInferior());
            pst.setString(2, tUP.getSuperior());
            pst.setInt(3, tUP.getId());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Treino: " + e.getMessage());
        }
    }

    public boolean deletarTreino(int id) {
        try (Connection con = Conexao.getConexao()) {
            String sql = "DELETE FROM Treino WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar Treino: " + e.getMessage());
        }
        return false;
    }
}