package controller;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.InstrutorDAO;
import model.Instrutor;
import view.JFNovoCadastro;

public class InstrutorController {
    InstrutorDAO iDAO = DAOFactory.InstrutorDAO();

    public void cadastrarInstrutor(JFNovoCadastro iVO) {
        iDAO.cadastrarInstrutor(iVO);
    }

    public ArrayList<Instrutor> listaInstrutor() {
        return iDAO.listarInstrutors();
    }

    public Instrutor buscarInstrutorPorNome(String nome) {
        return iDAO.buscarInstrutorPorNome(nome);
    }

    public void atualizarInstrutor(Instrutor iVO) {
        iDAO.atualizarInstrutor(iVO);
    }

    public boolean deletarInstrutor(int id) {
        return iDAO.deletarInstrutor(id);
    }

}
