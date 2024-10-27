package controller;

import java.util.ArrayList;

import dao.AlunoDAO;
import dao.DAOFactory;
import model.Alunos;
<<<<<<< HEAD
import view.JFNovoCadastro;
=======
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c

public class AlunoController {
    AlunoDAO aDAO = DAOFactory.AlunoDAO();

<<<<<<< HEAD
    public void cadastrarAluno(JFNovoCadastro aVO) {
=======
    public void cadastrarAluno(Alunos aVO) {
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c
        aDAO.cadastrarAluno(aVO);
    }

    public ArrayList<Alunos> listaAlunos() {
        return aDAO.listarAlunos();
    }

    public Alunos buscarAlunoPorNome(String nome) {
        return aDAO.buscarAlunoPorNome(nome);
    }

    public void atualizarAluno(Alunos aVO) {
        aDAO.atualizarAluno(aVO);
    }

    public boolean deletarAluno(int id) {
        return aDAO.deletarAluno(id);
    }

    public Alunos buscarAlunoPorId(int id) {
        return aDAO.buscarAlunoPorId(id);
    }

    public Alunos buscarAlunoPorMatricula(int Matricula) {
        return aDAO.buscarAlunoPorMatricula(Matricula);
    }

    }

