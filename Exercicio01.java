import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual lamapada voce quer construir? ");

        String tipo = scanner.nextLine();

        Lampada lampada = FabricaLampada.construir(tipo);
        lampada.ligar();
        lampada.desligar();

        System.out.println("----------------------------------");
        System.out.println("Fim");
    }
}
