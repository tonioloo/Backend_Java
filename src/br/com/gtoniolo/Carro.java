package br.com.gtoniolo;

public class Carro {

    //atributos da classe

    private String marca;
    private String modelo;
    private int ano;
    private int vel;

    // Getters and Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    // Métodos

    public void acelerar(int aceleracao) {
        vel = vel + aceleracao;
    }

    public void freiar(int freiar) {
        vel = vel - freiar;
    }

    public void buzinar(){
        System.out.println("bi bi");
    }
}

