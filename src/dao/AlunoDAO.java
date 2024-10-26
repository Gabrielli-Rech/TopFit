package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Alunos;



public class AlunoDAO {
    public void cadastrarAluno(Alunos aVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = ("insert into alunos (Nome, Endereco, Telefone, Data_de_Nascimento, Email, Info_Medicas, CPF, Sexo, Matricula, Senha");
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getNome());
            pst.setString(2, aVO.getEndereco());
            pst.setInt(3, aVO.getTelefone());
            pst.setString(4, aVO.getData_De_Nascimento());
            pst.setString(5, aVO.getEmail());
            pst.setString(6, aVO.getInfo_Medicas());
            pst.setInt(7, aVO.getCPF());
            pst.setString(8, aVO.getSexo());
            pst.setString(9, aVO.getMatricula());
            pst.setInt(10, aVO.getSenha());
            
            pst.execute();
            System.out.println("Aluno cadastrado com sucesso! ");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
    }

    public ArrayList<Alunos> listarAlunos() {
        ArrayList<Alunos> alunos = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from alunos where Matricula is not null";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Alunos aluno = new Alunos();
                aluno.setNome(rs.getString("Nome"));
                aluno.setData_De_Nascimento(rs.getString("Data_de_Nascimento"));
                aluno.setEndereco(rs.getString("Endereco"));
                aluno.setInfo_Medicas(rs.getString("Informacoes_medicas"));
                aluno.setEmail(rs.getString("Email"));
                aluno.setMatricula(rs.getString("Matricula"));
                aluno.setTelefone(rs.getInt("Telefone"));
                aluno.setCPF(rs.getInt("CPF"));
                alunos.add(aluno);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar Alunos: \n" + e.getMessage());
        }
        return alunos;
    }

    public Alunos buscarAlunoPorNome(String nome) {
        Alunos aluno = new Alunos();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from alunos where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "%" + nome + "%"); // Adicionando os curingas para o LIKE
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                aluno.setCPF(rs.getInt("CPF"));
                aluno.setNome(rs.getString("Nome"));
                aluno.setData_De_Nascimento(rs.getString("Data_de_Nascimento"));
                aluno.setEndereco(rs.getString("Endereco"));
                aluno.setEmail(rs.getString("Email"));
                aluno.setInfo_Medicas(rs.getString("Informacoes_medicas"));
                aluno.setMatricula(rs.getString("Matricula"));
                aluno.setTelefone(rs.getInt("Telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Aluno por nome: \n" + e.getMessage());
        }
        return aluno;
    }

    public Alunos buscarAlunoPorMatricula(int Matricula) {
        Alunos aluno = new Alunos();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from alunos where Matricula = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Matricula);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                aluno.setCPF(rs.getInt("CPF"));
                aluno.setNome(rs.getString("Nome"));
                aluno.setData_De_Nascimento(rs.getString("Data_de_Nascimento"));
                aluno.setEndereco(rs.getString("Endereco"));
                aluno.setEmail(rs.getString("Email"));
                aluno.setInfo_Medicas(rs.getString("Informacoes_medicas"));
                aluno.setMatricula(rs.getString("Matricula"));
                aluno.setTelefone(rs.getInt("Telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Aluno por Matricula: \n" + e.getMessage());
        }
        return aluno;
    }

    public Alunos buscarAlunoPorId(int Id) {
        Alunos aluno = new Alunos();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from alunos where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                aluno.setNome(rs.getString("nome"));
                aluno.setData_De_Nascimento(rs.getString("data_de_nascimento"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setEmail(rs.getString("email"));
                aluno.setInfo_Medicas(rs.getString("info_medicas"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setTelefone(rs.getInt("telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Aluno por ID: \n" + e.getMessage());
        }
        return aluno;
    }

    public void atualizarAluno(Alunos aVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update alunos set Data_de_Nascimento = ? where Matricula = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getData_De_Nascimento());
            pst.setString(2, aVO.getMatricula());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Aluno: \n" + e.getMessage());
        }
    }

    public boolean deletarAluno(int Matricula) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from alunos where Matricula = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Matricula);
            return pst.executeUpdate() != 0;
        } catch (Exception e) {
            System.out.println("Erro ao deletar Aluno: \n" + e.getMessage());
        }
        return false;
    }
}