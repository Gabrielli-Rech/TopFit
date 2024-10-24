package model;

public class Treino {

    private int Id;
    private String Nome;
    private String Exercicios;
    private String Series_e_Repeticoes;
    private String Inferior;
    private String Superior;

    public Treino() {
        this.Id = Id;
        this.Nome = Nome;
        this.Exercicios = Exercicios;
        this.Series_e_Repeticoes = Series_e_Repeticoes;

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

    public String getExercicios() {
        return Exercicios;
    }

    public void setExercicios(String Exercicios) {
        this.Exercicios = Exercicios;
    }

    public String getSeries_e_Repeticoes() {
        return Series_e_Repeticoes;
    }

    public void setSeries_e_Repeticoes(String Series_e_Repeticoes) {
        this.Series_e_Repeticoes = Series_e_Repeticoes;
    }

    public String getInferior() {
        return Inferior;
    }

    public void setInferior(String Inferior) {
        this.Inferior = Inferior;
    }

    public String getSuperior() {
        return Superior;
    }

    public void setSuperior(String Superior) {
        this.Superior = Superior;
    }

    @Override
    public String toString() {
        return "Treino [Id=" + Id + ", Nome=" + Nome + ", Exercicios=" + Exercicios + ", Series_e_Repeticoes="
                + Series_e_Repeticoes + ", Inferior=" + Inferior + ", Superior=" + Superior + "]";
    }
}
