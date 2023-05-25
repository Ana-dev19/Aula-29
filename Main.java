package Exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaPoupança contaPoupança = new ContaPoupança(1500);

        ContaCorrente contaCorrente = new ContaCorrente(2000);

        SeguroDeVida seguroDeVida = new SeguroDeVida(5000);

        Tributavel[] tributaveis = {contaPoupança, contaCorrente, seguroDeVida};

        double totalTributos = 0;

        for (Tributavel tributavel : tributaveis) {
            totalTributos += tributavel.calcularTributo();
        }
        System.out.println("Total de tributos: " + totalTributos);
        System.out.println("-----------------------------------------");
    }
}
