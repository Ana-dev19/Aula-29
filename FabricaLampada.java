public class FabricaLampada {
    public static Lampada construir(String tipo) {
        if (tipo.equalsIgnoreCase("incandescente")) {
            return new Incandescente();
        } else if
        (tipo.equalsIgnoreCase("flourescente")) {
            return new Fluorescente();
        } else {
            throw new IllegalArgumentException("Tipo de lampada inválido.");
        }
    }
}
