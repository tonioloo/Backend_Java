package br.com.gtoniolo;

public class Notas {

    // Atributos

    private double notaA;
    private double notaB;
    private double notaC;
    private double notaD;
    private double media;

    public Notas(int notaA, int notaB, int notaC, int notaD) {
        this.notaA = notaA;
        this.notaB = notaB;
        this.notaC = notaC;
        this.notaD = notaD;
    }
// Getters e Setters

    public double getNotaA() {
        return notaA;
    }

    public void setNotaA(int notaA) {
        this.notaA = notaA;
    }

    public double getNotaB() {
        return notaB;
    }

    public void setNotaB(int notaB) {
        this.notaB = notaB;
    }

    public double getNotaC() {
        return notaC;
    }

    public void setNotaC(int notaC) {
        this.notaC = notaC;
    }

    public double getNotaD() {
        return notaD;
    }

    public void setNotaD(int notaD) {
        this.notaD = notaD;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    // Método

    public void calcularMedia() {
         media = (getNotaA() + getNotaB() + getNotaC() + getNotaD()) / 4;
   }
}
