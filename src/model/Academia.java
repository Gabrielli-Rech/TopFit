package model;

public class Academia {
    private int Id;
    private String Nome;
    private String Endereco;
    private int Telefone;
    private String Data_De_Nascimento;
    private String Sexo;
    private String Email;
    private int CPF;
    private int Senha;
    private String CertificadoInstrutor;
    private String Exercicios;
    private String Series_e_Repeticoes;
    private String Torax;
    private String Ombro;
    private String Triceps;
    private String Costas;
    private String Abdomem;
    private String Pernas;
    private String Gluteo;
    private String Superior;
    private String Inferior;
    private String Biceps;

    public Academia() {
    }

    // Clase para aluno e instrutor
    public Academia(int Id, String Nome, String Endereco, int Telefone, String Data_De_Nascimento, String Email,
    String Sexo, int CPF, int Senha, String CertificadoInstrutor, String Exercicios,
    String Series_e_Repeticoes, String Torax, String Ombro, String Triceps, String Costas,
    String Abdomem, String Pernas, String Gluteo, String Superior, String Inferior, String Biceps) {
this.Id = Id;
this.Nome = Nome;
this.Endereco = Endereco;
this.Telefone = Telefone;
this.Data_De_Nascimento = Data_De_Nascimento;
this.Sexo = Sexo;
this.Email = Email;
this.CPF = CPF;
this.Senha = Senha;
this.CertificadoInstrutor = CertificadoInstrutor;
this.Exercicios = Exercicios;
this.Series_e_Repeticoes = Series_e_Repeticoes;
this.Torax = Torax;
this.Ombro = Ombro;
this.Triceps = Triceps;
this.Costas = Costas;
this.Abdomem = Abdomem;
this.Pernas = Pernas;
this.Gluteo = Gluteo;
this.Superior = Superior;
this.Inferior = Inferior;
this.Biceps = Biceps;
}

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }

    public int getid() {
        return Id;
    }

    public void setid(int Id) {
        this.Id = Id;

    }

    public String getCertificadoInstrutor() {
        return CertificadoInstrutor;
    }

    public void setCertificadoInstrutor(String certificadoInstrutor) {
        CertificadoInstrutor = certificadoInstrutor;
    }

    public String getExercicios() {
        return Exercicios;
    }

    public void setExercicios(String exercicios) {
        Exercicios = exercicios;
    }

    public String getSeries_e_Repeticoes() {
        return Series_e_Repeticoes;
    }

    public void setSeries_e_Repeticoes(String series_e_Repeticoes) {
        Series_e_Repeticoes = series_e_Repeticoes;
    }

    public String getTorax() {
        return Torax;
    }

    public void setTorax(String torax) {
        Torax = torax;
    }

    public String getOmbro() {
        return Ombro;
    }

    public void setOmbro(String ombro) {
        Ombro = ombro;
    }

    public String getTríceps() {
        return Triceps;
    }

    public void setTriceps(String triceps) {
    Triceps = triceps;
    }

    public String getCostas() {
        return Costas;
    }

    public void setCostas(String costas) {
        Costas = costas;
    }

    public String getAbdomem() {
        return Abdomem;
    }

    public void setAbdomem(String abdomem) {
        Abdomem = abdomem;
    }

    public String getPernas() {
        return Pernas;
    }

    public void setPernas(String pernas) {
        Pernas = pernas;
    }

    public String getGluteo() {
        return Gluteo;
    }

    public void setGluteo(String gluteo) {
        Gluteo = gluteo;
    }

    public String getSuperior() {
        return Superior;
    }

    public void setSuperior(String superior) {
        this.Superior = superior;
    }

    public String getInferior() {
        return Inferior;
    }

    public void setInferior(String inferior) {
        this.Inferior = inferior;
    }

    public String getBíceps() {
        return Biceps;
    }

    public void setBíceps(String bíceps) {
        Biceps = bíceps;
    }

    @Override
    public String toString() {
        return "Academia [Id=" + Id + ", Nome=" + Nome + ", Endereco=" + Endereco + ", Telefone=" + Telefone
                + ", Data_De_Nascimento=" + Data_De_Nascimento + ", Sexo=" + Sexo + ", Email=" + Email + ", CPF=" + CPF
                + ", Senha=" + Senha + ", CertificadoInstrutor=" + CertificadoInstrutor + ", Exercicios=" + Exercicios
                + ", Series_e_Repeticoes=" + Series_e_Repeticoes + ", Torax=" + Torax + ", Ombro=" + Ombro
                + ", Triceps=" + Triceps + ", Costas=" + Costas + ", Abdomem=" + Abdomem + ", Pernas=" + Pernas
                + ", Gluteo=" + Gluteo + ", Superior=" + Superior + ", Inferior=" + Inferior + ", Biceps=" + Biceps
                + "]";
    }

}