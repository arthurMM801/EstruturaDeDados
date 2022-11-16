package estruturaDeDados.Heap;

public class Main {
    public static void main(String[] args) {
        heapMaximo heap = new heapMaximo(10);

        heap.inserir(1);
        heap.exibir();
        heap.inserir(3);
        heap.exibir();
        heap.inserir(6);
        heap.exibir();
        heap.inserir(5);
        heap.exibir();
        heap.inserir(9);
        heap.exibir();
        heap.inserir(8);
        heap.exibir();
        heap.inserir(-2);
        heap.exibir();

        heap.remover();
        heap.exibir();

        heap.remover();
        heap.exibir();


    }
}

