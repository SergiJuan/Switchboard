public class Llamada {
    private int numeroOrigen;
    private int numeroDestino;
    private int duracion;
    private Franja franja;

    private double coste = 0;

    public Llamada(int numeroOrigen, int numeroDestino, int duracion, Franja franja) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        this.franja = franja;

        calcularCoste();
    }

    @Override
    public String toString() {
        return numeroOrigen + " -> " + numeroDestino + " | " + duracion + "s | " + franja.toString() + " | " + coste + "€";
    }

    public int getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(int numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public int getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(int numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Franja getFranja() {
        return franja;
    }

    public void setFranja(Franja franja) {
        this.franja = franja;
    }

    public double getCoste() {
        return coste;
    }

    public void calcularCoste() {
        switch (franja) {
            case LOCAL -> coste = 0.15 * duracion;
            case B1 -> coste = 0.20 * duracion;
            case B2 -> coste = 0.25 * duracion;
            case B3 -> coste = 0.30 * duracion;
        }
    }
}
