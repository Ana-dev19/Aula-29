public class Incandescente implements Lampada{
    @Override
    public void ligar() {
        System.out.println("Lampada incandescente ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Lampada incandescente desligada.");
    }
}
