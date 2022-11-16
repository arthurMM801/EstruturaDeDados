package estruturaDeDados.Arvore;

public class noArvore {
    public int valor;
    public int frequencia;
    public noArvore esquerda;
    public noArvore direita;

    public noArvore(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}

