package controller;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.GrupoMuscularDAO;
import model.GrupoMuscular;

public class GrupoMuscularController {
        GrupoMuscularDAO aDAO = DAOFactory.GrupoMuscularDAO();

    public void cadastrarGrupoMuscular(GrupoMuscular gmVO) {
        aDAO.cadastrarGrupoMuscular(gmVO);
    }

    public ArrayList<GrupoMuscular> listaGrupoMusculars() {
        return aDAO.listarGrupoMusculars();
    }

    public GrupoMuscular buscarGrupoMuscularPorNome(String nome) {
        return aDAO.buscarGrupoMuscularPorNome(nome);
    }

    public void atualizarGrupoMuscular(GrupoMuscular aVO) {
        aDAO.atualizarGrupoMuscular(aVO);
    }

    public boolean deletarGrupoMuscular(int id) {
        return aDAO.deletarGrupoMuscular(id);
    }
        public GrupoMuscular buscarGrupoMuscularPorId(int id) {
        return aDAO.buscarGrupoMuscularPorId(id);
    }
}
