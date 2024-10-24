package model;
public class GrupoMuscular {

    private int Id;
    private String Nome;
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

    public GrupoMuscular() {
        this.Id = Id;
        this.Nome = Nome;
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

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTorax() {
        return Torax;
    }

    public void setTorax(String Torax) {
        this.Torax = Torax;
    }

    public String getOmbro() {
        return Ombro;
    }

    public void setOmbro(String Ombro) {
        this.Ombro = Ombro;
    }

    public String getTriceps() {
        return Triceps;
    }

    public void setTriceps(String Triceps) {
        this.Triceps = Triceps;
    }

    public String getCostas() {
        return Costas;
    }

    public void setCostas(String Costas) {
        this.Costas = Costas;
    }

    public String getAbdomem() {
        return Abdomem;
    }

    public void setAbdomem(String Abdomem) {
        this.Abdomem = Abdomem;
    }

    public String getPernas() {
        return Pernas;
    }

    public void setPernas(String Pernas) {
        this.Pernas = Pernas;
    }

    public String getGluteo() {
        return Gluteo;
    }

    public void setGluteo(String Gluteo) {
        this.Gluteo = Gluteo;
    }

    public String getSuperior() {
        return Superior;
    }

    public void setSuperior(String Superior) {
        this.Superior = Superior;
    }

    public String getInferior() {
        return Inferior;
    }

    public void setInferior(String Inferior) {
        this.Inferior = Inferior;
    }

    public String getBiceps() {
        return Biceps;
    }

    public void setBiceps(String Biceps) {
        this.Biceps = Biceps;
    }

    @Override
    public String toString() {
        return "GrupoMuscular [Id=" + Id + ", Nome=" + Nome + ", Torax=" + Torax + ", Ombro=" + Ombro + ", Triceps=" + Triceps
                + ", Costas=" + Costas + ", Abdomem=" + Abdomem + ", Pernas=" + Pernas + ", Gluteo=" + Gluteo
                + ", Superior=" + Superior + ", Inferior=" + Inferior + ", Biceps=" + Biceps + "]";
    }
}
