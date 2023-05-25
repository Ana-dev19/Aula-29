package Exercicio2;

public class SeguroDeVida extends BemTributavel{
    public SeguroDeVida(double valor) {
        super(valor);
    }

    @Override
    public double calcularTributo() {
        return 42;
    }
}
