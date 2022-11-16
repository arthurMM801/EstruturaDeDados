package estruturaDeDados.ListaOrdenada;

public class Main {
    public static void main(String[] args) {
        listaOrdenada lista = new listaOrdenada();

        lista.add(1);
        lista.show();
        lista.add(6);
        lista.show();
        lista.add(3);
        lista.show();
        lista.add(-1);
        lista.show();
        lista.add(9);
        lista.show();
        lista.remove(2);

        lista.show();
    }
}
