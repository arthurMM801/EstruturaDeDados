package estruturaDeDados.ListaEstatica;

public class Main {
    public static void main(String[] args) {
        listaEstatica lista = new listaEstatica();

        lista.add(5);
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(4, 17);
        lista.add(10);
        lista.add(9);

        lista.show();
        lista.clear();
    }
}
