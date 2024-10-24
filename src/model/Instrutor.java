package model;

public class Instrutor {

    private String Nome;
    private String Endereco;
    private int Telefone;
    private String Data_De_Nascimento;
    private String Sexo;
    private String Email;
    private int CPF;
    private int Senha;
    private String CertificadoInstrutor;
    private String Id;
    public Instrutor() {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Data_De_Nascimento = Data_De_Nascimento;
        this.Sexo = Sexo;
        this.Email = Email;
        this.CPF = CPF;
        this.Senha = Senha;
        this.CertificadoInstrutor = CertificadoInstrutor;
        this.Id = Id; 
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getData_De_Nascimento() {
        return Data_De_Nascimento;
    }

    public void setData_De_Nascimento(String Data_De_Nascimento) {
        this.Data_De_Nascimento = Data_De_Nascimento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }

    public String getCertificadoInstrutor() {
        return CertificadoInstrutor;
    }

    public void setCertificadoInstrutor(String CertificadoInstrutor) {
        this.CertificadoInstrutor = CertificadoInstrutor;
    }

    public String getId (){
        return Id;
    }
    public void setId (String Id){
        this.Id = Id;
    }
    @Override
    public String toString() {
        return "Instrutor [Nome=" + Nome + ", Endereco=" + Endereco + ", Telefone=" + Telefone + ", Data_De_Nascimento="
                + Data_De_Nascimento + ", Sexo=" + Sexo + ", Email=" + Email + ", CPF=" + CPF + ", Senha=" + Senha
                + ", CertificadoInstrutor=" + CertificadoInstrutor + "]";
    }
}
