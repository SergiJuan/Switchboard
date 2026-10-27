public class Centralita {

    private Llamada[] llamadas = new Llamada[100];
    private static int cantidadLlamadas = 0;

    public Centralita() {

    }

    public Centralita(Llamada... llamadas) {
        for (int i = 0; i < llamadas.length; i++) {
            this.llamadas[i] = llamadas[i];
        }
        cantidadLlamadas = llamadas.length;
    }

    public void registrarLlamada(Llamada newLlamada) {
        for (int i = 0; i < llamadas.length; i++) {
            if (llamadas[i] == null) {
                llamadas[i] = newLlamada;
                break;
            }
        }
    }

    public void print() {
        for (Llamada llamada : llamadas) {
            if (llamada == null) {
                break;
            }
            System.out.println(llamada);
        }
    }

    public static int getCantidadLlamadas() {
        return cantidadLlamadas;
    }
}
