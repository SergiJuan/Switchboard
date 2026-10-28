public class Llamada {
    private int numeroOrigen;
    private int numeroDestino;
    private int duracion;
    private int franja;
    private boolean isLocal;

    private double coste = 0;

    public Llamada(int numeroOrigen, int numeroDestino, int duracion, int franja, boolean isLocal) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        this.franja = franja;
        this.isLocal = isLocal;

        calcularCoste();
    }

    @Override
    public String toString() {
        return numeroOrigen + " -> " + numeroDestino + " | " + duracion + "s | " + franja + " | " + (isLocal ? "LOCAL" : "PROVINCIAL")+ " | " + coste + "€";
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

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }

    public double getCoste() {
        return coste;
    }

    public void calcularCoste() {
        if (isLocal) {
            coste = 0.15 * duracion;
        } else {
            switch (franja) {
                case 1 -> coste = 0.20 * duracion;
                case 2 -> coste = 0.25 * duracion;
                case 3 -> coste = 0.30 * duracion;
                default -> coste = 0.15 * duracion;
            }
        }
    }
}
