package br.com.gtoniolo;

public class CalculoNotas {
    public static void main(String[] args) {

        Notas notas = new Notas(5, 6, 8, 9);

        notas.calcularMedia();

        System.out.println("Sua média final é: " + notas.getMedia());

    }
}
