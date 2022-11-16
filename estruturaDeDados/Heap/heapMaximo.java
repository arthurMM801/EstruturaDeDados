package estruturaDeDados.Heap;

public class heapMaximo {
    private int[] dados;
    private int contador;

    public heapMaximo(int n) {
        dados = new int[n];
        contador = 0;
    }

    public int maior() {
        if (contador > 0)
            System.out.println("Heap vazio");

        return dados[0];
    }

    public boolean vazio() {

        if(contador == 0)
            return true;
        else
            return false;

    }

    public void inserir(int valor) {
        if (contador == dados.length)
            System.out.println("Heap lotado");

        dados[contador] = valor;
        subir(contador);
        contador++;

    }

    private void subir(int indice) {
        int indicePai, temp;

        if (indice != 0) {
            indicePai = (indice - 1) / 2;

            if (dados[indicePai] < dados[indice]) {
                temp = dados[indicePai];
                dados[indicePai] = dados[indice];
                dados[indice] = temp;
                subir(indicePai);
            }
        }
    }

    public void remover() {
        if (vazio())
            System.out.println("Heap vazio");

        dados[0] = dados[contador - 1];
        contador--;

        if (contador > 0)
            descer(0);
    }

    private void descer(int indice) {
        int indiceFilhoEsquerdo, indiceFilhoDireito, indiceMax, temp;

        indiceFilhoEsquerdo = 2 * indice + 1;
        indiceFilhoDireito = 2 * indice + 2;

        if (indiceFilhoDireito >= contador) {
            if (indiceFilhoEsquerdo >= contador)
                return;
            else
                indiceMax = indiceFilhoEsquerdo;
        } else {
            if (dados[indiceFilhoEsquerdo] >= dados[indiceFilhoDireito])
                indiceMax = indiceFilhoEsquerdo;
            else
                indiceMax = indiceFilhoDireito;
        }

        if (dados[indice] < dados[indiceMax]) {
            temp = dados[indiceMax];
            dados[indiceMax] = dados[indice];
            dados[indice] = temp;
            descer(indiceMax);
        }
    }

    public void exibir() {
        for (int i = 0; i < contador; i++)
            System.out.print(dados[i] + " ");

        System.out.println();
    }

}
