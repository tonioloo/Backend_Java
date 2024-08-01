package br.com.gtoniolo;

public class CarroTestar {

    public static void main(String[] args) {

        Carro carro = new Carro();

        // Chamando os atributos e métodos da classe Carro

        carro.setMarca("Volkswagen");
        carro.setModelo("Jetta");
        carro.setAno(2017);
        carro.setVel(110);

        carro.acelerar(10);

        System.out.println("Velocidade: " + carro.getVel() + "Km/h");

        carro.freiar(10);

        System.out.println("Velocidade: " + carro.getVel() + "Km/h");

        carro.buzinar();
    }
}
