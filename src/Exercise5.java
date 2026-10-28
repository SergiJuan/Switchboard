public class Exercise5 {
    public static void main(String[] args) {
        Llamada llamada1 = new Llamada(698712256, 681416258, 40, 1, false);
        Llamada llamada2 = new Llamada(698712256, 681416258, 90, 3, false);
        Llamada llamada3 = new Llamada(608912256, 601416258, 15, 2, false);

        Centralita centralita = new Centralita(llamada1, llamada2, llamada3);

        centralita.print();
        System.out.println("Cantidad llamadas: "+Centralita.getCantidadLlamadas());

        centralita.registrarLlamada(new Llamada(608912256, 601416258, 25, 1, true));
        centralita.print();
    }
}