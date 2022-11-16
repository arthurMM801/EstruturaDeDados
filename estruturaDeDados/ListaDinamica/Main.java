package estruturaDeDados.ListaDinamica;

public class Main {
    public static void main(String[] args) {
        listaDinamica lista = new listaDinamica();

        lista.add(3);
        lista.add(2);
        lista.add(6);
        lista.add(1);
        lista.add(9);
        lista.add(2, 10);
        lista.remove(2);

        System.out.println(lista.contains(2));

        lista.show();
    }
}
