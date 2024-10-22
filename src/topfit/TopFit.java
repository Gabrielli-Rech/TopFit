package topfit;

import java.util.ArrayList;
import java.util.Scanner;

import controller.AlunoController;
import controller.ControllerFactory;
import controller.ExercicioController;
import controller.InstrutorController;
import controller.TreinoController;
import model.Aluno;
import model.Exercicios;
import model.GrupoMuscular;
import model.Instrutor;
import model.Treino;

public class TopFit {

    static Scanner ler = new Scanner(System.in);
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static ArrayList<Instrutor> instrutores = new ArrayList<>();
    static ArrayList<Exercicios> exercicios = new ArrayList<>();
    static ArrayList<GrupoMuscular> gruposMusculares = new ArrayList<>();
    static ArrayList<Treino> treinos = new ArrayList<>();

    public static int lerInt() {
        int num = -1; // Inicializa com um valor inválido
        while (num < 0) {
            try {
                num = ler.nextInt();
                ler.nextLine(); // Limpa o buffer
            } catch (Exception e) {
                System.out.print("Tente Novamente: ");
                ler.nextLine(); // Limpa o buffer em caso de erro
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int opMP;
        do {
            menuP();
            opMP = lerInt();
            subMenuP(opMP);
        } while (opMP != 0);
    }

    public static void menuP() {
        String menu = "0 - Sair\n"
                + "1 - Cadastrar\n"
                + "2 - Listar Alunos\n"
                + "3 - Listar Treinos\n"
                + "4 - Listar Exercícios\n"
                + "5 - Selecionar Grupo Muscular\n";
        System.out.println(menu);
        System.out.print("Informe sua escolha: ");
    }

    public static void subMenuP(int omP) {
        System.out.println(" < SubMenu >");
        switch (omP) {
            case 1:
                System.out.print("1 - Aluno\n"
                        + "2 - Instrutor\n"
                        + "3 - Treino\n"
                        + "4 - Exercícios\n"
                        + "5 - Grupo Muscular\n"
                        + "Digite a opção: ");
                int opSubMenu = lerInt();
                criar(opSubMenu);
                break;
            case 2:
                listarAlunos();
                break;
            case 3:
                listarTreinos();
                break;
            case 4:
                listarExercicios();
                break;
            case 0:
                System.out.println("Academia encerrada pelo usuário");
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
    }

    private static void listarAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.getNome() + ", Matrícula: " + a.getMatricula() + ", CPF " + a.getCPF() + ", Email " + a.getEmail() + ", Data de nascimento" + a.getData_De_Nascimento());
        }
    }

    private static void listarTreinos() {
        System.out.println("Lista de Treinos:");
        for (Treino t : treinos) {
            System.out.println("Nome do Treino: " + t.getNome());
        }
    }

    private static void listarExercicios() {
        System.out.println("Lista de Exercícios:");
        for (Exercicios e : exercicios) {
            System.out.println("Nome do Exercício: " + e.getNome());
        }
    }

    private static void criar(int opSP) {
        switch (opSP) {
            case 1: // Cadastrar Aluno
                System.out.println(" < Criar Aluno >");
                Aluno aluno = new Aluno();
                System.out.print("Informe o nome do Aluno: ");
                aluno.setNome(ler.nextLine());
                System.out.print("Informe o Endereço do aluno: ");
                aluno.setEndereco(ler.nextLine());
                System.out.print("Informe sua data de Nascimento: ");
                aluno.setData_De_Nascimento(ler.nextLine());
                System.out.print("Informe seu Email: ");
                aluno.setEmail(ler.nextLine());
                System.out.print("Posui informações medicas? ");
                aluno.setInfo_Medicas(ler.nextLine());
                System.out.print("Informe seu Telefone: ");
                aluno.setTelefone(ler.nextInt());
                System.out.print("Informe a matrícula do Aluno: ");
                aluno.setMatricula(ler.nextInt());
                alunos.add(aluno);
                AlunoController alunoController = ControllerFactory.getAlunoController();
                alunoController.cadastrarAluno(aluno);
                break;
            case 2: // Cadastrar Instrutor
                System.out.println(" < Criar Instrutor >");
                Instrutor instrutor = new Instrutor();
                System.out.print("Informe o nome do Instrutor: ");
                instrutor.setNome(ler.nextLine());
                instrutores.add(instrutor);
                InstrutorController instrutorController = ControllerFactory.getInstrutorController();
                instrutorController.cadastrarInstrutor(instrutor);
                break;
            case 3: // Cadastrar Treino
                System.out.println(" < Criar Treino >");
                Treino treino = new Treino();
                System.out.print("Informe o nome do Treino: ");
                treino.setNome(ler.nextLine());
                treinos.add(treino);
                TreinoController treinoController = ControllerFactory.getTreinoController();
                treinoController.cadastrarTreino(treino);
                break;
            case 4: // Cadastrar Exercício
                System.out.println(" < Criar Exercício >");
                Exercicios exercicio = new Exercicios();
                System.out.print("Informe o nome do Exercício: ");
                exercicio.setNome(ler.nextLine());
                exercicios.add(exercicio);
                ExercicioController exercicioController = ControllerFactory.getExercicioController();
                exercicioController.cadastrarExercicios(exercicio);
                break;
            case 5: // Cadastrar Grupo Muscular (implementação básica)
                System.out.println(" < Criar Grupo Muscular >");
                GrupoMuscular grupoMuscular = new GrupoMuscular();
                System.out.print("Informe o nome do Grupo Muscular: ");
                grupoMuscular.setNome(ler.nextLine());
                gruposMusculares.add(grupoMuscular);
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
    }
}