package estruturaDeDados.Pilha;

public class Main {
    public static void main(String[] args) {
        pilha lista = new pilha();

        lista.add("arthur");
        lista.show();
        lista.add("ronaldo");
        lista.show();
        lista.add("lidia");
        lista.show();
        lista.add("juliana");
        lista.show();
        lista.remove();
        lista.show();
    }
}
