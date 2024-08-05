package br.com.gtoniolo;

public class CalculoNotas {
    public static void main(String[] args) {

        Notas notas = new Notas(3, 1, 6, 9);

        notas.calcularMedia();

        System.out.println("Sua média final é: " + notas.getMedia());
        
        if (notas.getMedia() >= 7) {
            System.out.println("Situação: aprovado");
        } else if (notas.getMedia() >= 5) {
            System.out.println("Situação: recuperação");
        } else {
            System.out.println("Situação: reprovado");
        }
    }
}
