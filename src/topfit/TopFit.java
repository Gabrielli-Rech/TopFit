package topfit;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.ControllersFactory;
import Controller.ExerciciosControllers;
import Controller.InstrutorControllers;
import controller.AlunoController;
import controller.ControllerFactory;
import controller.InstrutorController;
import model.Academia;
import model.Aluno;
import model.Instrutor;

public class TopFit {

    static Scanner ler = new Scanner(System.in);
    static int opMP;
    static ArrayList<Aluno> Alunos = new ArrayList<>();
    static ArrayList<Instrutor> Instrutors = new ArrayList<>();
    static ArrayList<Academia> Exercicios = new ArrayList<>();

    public static int lerInt() {
        Scanner ler = new Scanner(System.in);
        int num = 99;
        try {// o que pode dar erro
            num = ler.nextInt();
        } catch (Exception e) {// tratar o erro
            System.out.print("Tente Novamente: ");
            lerInt();
        }
        return num;
    }

    public static void main(String[] args) {
//        System.out.println("< ARENA DE OBJETOS >");
//        do {
//            menuP();
//            subMenuP(opMP);
//        } while (opMP != 0);

        Principal janelaP = new Principal();
        janelaP.setVisible(true);
    }

    public static void menuP() {// menu principal
        String menu;
        menu = "0 - Sair\n"
                + "1 - Cadastrar \n"
                + "2 - Listar Personagens \n"
                + "3 - Batalha";
        System.out.println(menu);
        System.out.print("Informe sua escolha: ");
        opMP = lerInt();
    }// fim menuP

    public static void subMenuP(int omP) {
        System.out.println(" < SubMenu >");
        String subMenu;
        switch (omP) {
            case 1:
                System.out.print("1 - Aluno\n"
                        + "2 - Ladrão\n"
                        + "3 - Vitima\n"
                        + "Digite a opção: ");
                int opMP = lerInt();
                criarPersona(opMP);
                break;
            case 2:
                System.out.println("Lista de Personagens");
                System.out.println(Alunos.toString());
                System.out.println("Lista bonita");
                for (Aluno g : Alunos) {
                    System.out.println("Nome do Aluno: " + g.getNome());
                    System.out.println("Armamento: " + g.getArmamento());
                    System.out.println("Pontos de vida: " + g.getPontosDeVida());
                }
                for (Instrutor l : Instrutors) {
                    System.out.println("Nome do ladrão: " + l.getNome());
                    System.out.println("Plano de Fuga: " + l.getPlanoDeFuga());
                    System.out.println("Pontos de vida: " + l.getPontosDeVida());
                }
                for (Academia p : Exercicios) {
                    System.out.println("Nome da vitima: " + p.getNome());
                    System.out.println("Pontos de vida: " + p.getPontosDeVida());
                }
                System.out.println("Ladrão Ram");
                System.out.println(Instrutors.toString());
                System.out.println("Vitima Ram");
                System.out.println(Exercicios.toString());
                System.out.println("Vitima Bamco de Dados");

                ExerciciosControllers vs = ControllersFactory.getExerciciosControllers();
                System.out.println(vs.listaExercicios().toString());

                System.out.println(" --Buscar vitima por nome --");
                System.out.println(vs.buscaVitimaByNome("Ian").toString());
                Academia vUP = vs.buscaVitimaByNome("%Ian%");

                vUP.setCabelo("Preto");
                vs.atualizarVitima(vUP);
                System.out.println("-- Vítima Atualizada --");
                System.out.println(vs.buscaVitimaByNome("%Ian%").toString());
                System.out.println("- deletar vitima Ana -");
                int id = vs.buscaVitimaByNome("%Ana%").getId();
                if (vs.deletarExercicios(id)) {
                    System.out.println("Vítima deletada");
                } else {
                    System.out.println("Erro ao deletar vítima");
                }

                AlunoController gs = ControllersFactory.getAlunoController();
                System.out.println(gs.listaAlunos().toString());
                System.out.println(" --Buscar Aluno por nome -Eli-");
                System.out.println(gs.buscaAlunosByNome("Eli").toString());
                Aluno gUP = gs.buscaAlunosByNome("%Eli%");
                gUP.setCabelo("Preto");
                gs.atualizarAlunos(gUP);
                System.out.println("-- Aluno Atualizado --");
                System.out.println(gs.buscaAlunosByNome("%Bob%").toString());
                System.out.println("- deletar Aluno  -");
                int idg = gs.buscaAlunosByNome("%Bob%").getId();
                if (gs.deletarAlunos(idg)) {
                    System.out.println("Aluno deletado");
                } else {
                    System.out.println("Erro ao deletar Aluno");
                }
                InstrutorController ls = ControllerFactory.getInstrutorController();
                System.out.println(ls.listaInstrutor().toString());
                System.out.println(" --Buscar Instrutor por nome -Luis-");
                System.out.println(ls.buscaInstrutorByNome("Luis").toString());
                Instrutor lUP = ls.buscaInstrutorByNome("%Luis%");
                lUP.setCabelo("Branco");
                ls.atualizarInstrutor(lUP);
                System.out.println("-- Ladrão Atualizado --");
                System.out.println(ls.buscaInstrutorByNome("%Wendel%").toString());
                System.out.println("- Deletar Instrutor  -");
                int idl = ls.buscaInstrutorByNome("%Wendel%").getId();
                if (ls.deletarInstrutor(idl)) {
                    System.out.println("Ladrão deletado");
                } else {
                    System.out.println("Erro ao deletar ladrão");
                }
                break;
            case 3:
                break;
            case 0:
                System.out.println("Arena de objeto encerrada pelo usuário");
                break;
            default:
                System.out.println("Opção invalida, tente novamente!");
                menuP();
                break;
        }
    }// fim do switch

    private static void criarPersona(int opSP) {
        switch (opSP) {
            case 1:
                System.out.println(" < Criar Aluno >");
                Aluno g = new Aluno();
                System.out.print("Informe o nome do Aluno: ");
                g.setNome(ler.nextLine());
                System.out.print("Informe o cabelo do Aluno: ");
                g.setCabelo(ler.nextLine());
                System.out.print("Informe o olho do Aluno: ");
                g.setOlho(ler.nextLine());
                System.out.print("Informe a pele do Aluno: ");
                g.setPele(ler.nextLine());
                System.out.print("Escolha o sexo do Aluno\n"
                        + "1 - Feminino\n"
                        + "2 - Masculino\n"
                        + "Digite a opção desejada: ");
                int sexoInt = lerInt();
                boolean sexo = false;
                if (sexoInt == 2) {
                    sexo = true;
                }
                g.setSexo(sexo);
                System.out.println("Informe o armamento do Aluno: ");
                g.setArmamento(ler.nextLine());
                Alunos.add(g);
                AlunoController GS = ControllersFactory.getAlunoController();
                GS.cadastrarAluno(g);
                break;
            case 2:
                System.out.println(" < Criar Ladrão >");
                Instrutor l = new Instrutor();
                System.out.print("Informe o nome do Ladrão: ");
                l.setNome(ler.nextLine());
                System.out.print("Informe o cabelo do Ladrão: ");
                l.setCabelo(ler.nextLine());
                System.out.print("Informe o olho do Ladrão: ");
                l.setOlho(ler.nextLine());
                System.out.print("Informe a pele do Ladrão: ");
                l.setPele(ler.nextLine());
                System.out.print("Escolha o sexo do Ladrão\n"
                        + "1 - Feminino\n"
                        + "2 - Masculino\n"
                        + "Digite a opção desejada: ");
                int sexoIntL = lerInt();
                boolean sexoL = false;
                if (sexoIntL == 2) {
                    sexo = true;
                }
                l.setSexo(sexoL);
                System.out.println("Informe o plano de fuga do ladrão: ");
                l.setPlanoDeFuga(ler.nextLine());
                Instrutors.add(l);
                InstrutorControllers LS = ControllersFactory.getInstrutorControllers();
                LS.cadastrarInstrutor(l);
                break;
            case 3:
                System.out.println("< Criar Vitima >");
                Academia p = new Academia();
                System.out.print("Informe o nome da Vitima: ");
                p.setNome(ler.nextLine());
                System.out.print("Informe o cabelo da Vitima: ");
                p.setCabelo(ler.nextLine());
                System.out.print("Informe o olho da Vitima: ");
                p.setOlho(ler.nextLine());
                System.out.print("Informe a pele da Vitima: ");
                p.setPele(ler.nextLine());
                System.out.print("Escolha o sexo da Vitima\n"
                        + "1 - Feminino\n"
                        + "2 - Masculino\n"
                        + "Digite a opção desejada: ");
                int sexoIntP = lerInt();
                boolean sexoP = false;
                if (sexoIntP == 2) {
                    sexo = true;
                }
                p.setSexo(sexoP);
                Exercicios.add(p);// add vitima numa arraylist
                ExerciciosControllers VS = ControllersFactory.getExerciciosControllers();
                VS.cadastrarVitima(p);
                break;
            default:
                System.out.println("Opção invalida, tente novamente!");
                subMenuP(opSP);
                break;
        }
    }
}
