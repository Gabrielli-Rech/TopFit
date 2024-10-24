package dao;

public class DAOFactory {
    private static AlunoDAO aDAO = new AlunoDAO();

    public static AlunoDAO AlunoDAO() {
        return aDAO;
    }

    private static InstrutorDAO iDAO = new InstrutorDAO();

    public static InstrutorDAO InstrutorDAO() {
        return iDAO;
    }

    private static TreinoDAO tDAO = new TreinoDAO();

    public static TreinoDAO TreinoDAO() {
        return tDAO;
    }

    private static GrupoMuscularDAO gmDAO = new GrupoMuscularDAO();

    public static GrupoMuscularDAO GrupoMuscularDAO() {
        return gmDAO;
    }
}
