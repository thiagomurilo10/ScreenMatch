package br.com.alura.screenmatch.novoDesafio;

public class Audio{
    private String titulo;
    private int duraçãoEmMinutos;
    private int totalDeReproduções;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuraçãoEmMinutos() {
        return duraçãoEmMinutos;
    }

    public void setDuraçãoEmMinutos(int duraçãoEmMinutos) {
        this.duraçãoEmMinutos = duraçãoEmMinutos;
    }

    public int getTotalDeReproduções() {
        return totalDeReproduções;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduzir() {
        this.totalDeReproduções++;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
