package Exercicio2;

public class ContaPoupança extends BemTributavel{
    public ContaPoupança(double valor) {
        super(valor);
    }

    @Override
    public double calcularTributo() {
        return 0;
    }
}
