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

    private static GrupoMuscularDAO gmDAO = new GrupoMuscularDAO();

    public static GrupoMuscularDAO GrupoMuscularDAO() {
        return gmDAO;
    }

    private static ExerciciosDAO eDAO = new ExerciciosDAO();

    public static ExerciciosDAO ExerciciosDAO() {
        return eDAO;
    }
}
