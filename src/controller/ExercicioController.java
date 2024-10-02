package controller;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.ExerciciosDAO;
import model.Exercicios;

public class ExercicioController {
    ExerciciosDAO eDAO = DAOFactory.ExerciciosDAO();

    public void cadastrarExercicios(Exercicios eVO) {
        eDAO.cadastrarExercicios(eVO);
    }

    public ArrayList<Exercicios> listaExercicioss() {
        return eDAO.listarExercicioss();
    }

    public Exercicios buscarExerciciosPorNome(String nome) {
        return eDAO.buscarExerciciosPorNome(nome);
    }

    public void atualizarExercicios(Exercicios eVO) {
        eDAO.atualizarExercicios(eVO);
    }

    public boolean deletarExercicios(int id) {
        return eDAO.deletarExercicios(id);
    }
        public Exercicios buscarExerciciosPorId(int id) {
        return eDAO.buscarExerciciosPorId(id);
    }
}
