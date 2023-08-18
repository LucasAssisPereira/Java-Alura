package br.com.alura.minhasmusicas.principal.modelos;

public class Audio {
    private String titulo;
    private  int totalReproducao;
    private int totalCurtidas;
    private double classificao;


    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduzir(){
        this.totalReproducao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificao() {
        return classificao;
    }
}
