package model;

public class Aluno extends Academia {
    private int Matricula;
    private String Info_Medicas;

    public Aluno() {
    }

    public Aluno(String id, String nome, String endereco, int telefone, String data_de_nascimento, String email,
            int cpf, int Matricula, String Info_Medicas) {
        super();
        this.Info_Medicas = Info_Medicas;
        this.Matricula = Matricula;
    }

    public String getInfo_Medicas() {
        return Info_Medicas;
    }

    public void setInfo_Medicas(String Info_Medicas) {
        this.Info_Medicas = Info_Medicas;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    @Override
    public String toString() {
        return "Aluno [Matricula=" + Matricula + ", Info_Medicas=" + Info_Medicas + ", getInfo_Medicas()="
                + getInfo_Medicas() + ", getMatricula()=" + getMatricula() + ", getNome()=" + getNome() + ", getId()="
                + getId() + ", getEndereco()=" + getEndereco() + ", getTelefone()=" + getTelefone()
                + ", getData_De_Nascimento()=" + getData_De_Nascimento() + ", getCPF()=" + getCPF() + ", getEmail()="
                + getEmail() + ", toString()=" + super.toString() + ", getid()=" + getid() + "]";
    }

    
    

}
