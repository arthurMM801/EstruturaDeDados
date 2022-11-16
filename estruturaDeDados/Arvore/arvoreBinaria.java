package estruturaDeDados.Arvore;

public class arvoreBinaria {
    private noArvore raiz;

    public arvoreBinaria() {
        raiz = null;
    }

    public void add(int valor) {

        if (raiz == null)
            raiz = new noArvore(valor);
        else
            add(valor, raiz);

    }




    private void add(int valor, noArvore raiz) {
        if (valor < raiz.valor) {
            if (raiz.esquerda == null)
                raiz.esquerda = new noArvore(valor);
            else
                add(valor, raiz.esquerda);

        }else if (valor > raiz.valor) {
            if (raiz.direita == null)
                raiz.direita = new noArvore(valor);
            else
                add(valor, raiz.direita);
        }
    }

    public boolean contains(int valor) {
        if (raiz == null)
            return false;
        else
            return contains(valor, raiz);

    }

    private boolean contains(int valor, noArvore raiz) {
        if (valor == raiz.valor) {
            return true;

        } else if (valor < raiz.valor) {
            if (raiz.esquerda == null)
                return false;
            else
                return contains(valor, raiz.esquerda);

        } else if (valor > raiz.valor) {
            if (raiz.direita == null)
                return false;
            else
                return contains(valor, raiz.direita);

        }

        return false;
    }

    public void remove(int valor) {
        if(raiz.esquerda == null && raiz.direita == null){
            System.out.println("Voce não pode remover a raiz da arvore!");
            return;
        }

        if (raiz != null)
            remove(valor, raiz, null);

    }

    private void remove(int valor, noArvore raiz, noArvore pai) {
        if (valor == raiz.valor) {
            if (raiz.esquerda == null && raiz.direita == null) {      // raiz não tem filhos
                if (raiz == pai.esquerda)
                    pai.esquerda = null;
                else
                    pai.direita = null;

            } else if (raiz.esquerda != null && raiz.direita == null) { // raiz tem um filho (esquerdo)
                if (raiz == pai.esquerda)
                    pai.esquerda = raiz.esquerda;
                else
                    pai.direita = raiz.esquerda;

            } else if (raiz.esquerda == null && raiz.direita != null) { // raiz tem um filho (direito)
                if (raiz == pai.esquerda)
                    pai.esquerda = raiz.direita;
                else
                    pai.direita = raiz.direita;

            } else if (raiz.esquerda != null && raiz.direita != null) { // raiz tem dois filhos
                raiz.valor = menorValor(raiz.direita); // Pegando o menor valor depois da raiz
                remove(raiz.valor, raiz.direita, raiz);


                // raiz.valor = maiorValor(raiz.esquerda);  Pegando o maior valor depois da raiz
                // remove(raiz.valor, raiz.esquerda, raiz);

            }

        } else if (valor < raiz.valor) {
            if (raiz.esquerda != null)
                remove(valor, raiz.esquerda, raiz);

        } else if (valor > raiz.valor) {
            if (raiz.direita != null)
                remove(valor, raiz.direita, raiz);
        }
    }

    public int menorValor() {
        if (raiz.esquerda == null)
            return raiz.valor;
        else
            return menorValor(raiz.esquerda);
    }

    private int menorValor(noArvore raiz) {
        if (raiz.esquerda == null)
            return raiz.valor;
        else
            return menorValor(raiz.esquerda);

    }

    public int maiorValor() {
        if (raiz.direita == null)
            return raiz.valor;
        else
            return maiorValor(raiz.direita);

    }

    private int maiorValor(noArvore raiz) {
        if (raiz.direita == null)
            return raiz.valor;
        else
            return maiorValor(raiz.direita);

    }

    public void exibirPreOrdem() {
        if (raiz != null) {
            System.out.print("Pre.: ");
            exibirPreOrdem(raiz);
            System.out.println();
        }
    }

    private void exibirPreOrdem(noArvore raiz) {
        System.out.print(raiz.valor + " ");

        if (raiz.esquerda != null) {
            exibirPreOrdem(raiz.esquerda);
        }

        if (raiz.direita != null) {
            exibirPreOrdem(raiz.direita);
        }
    }

    public void exibirEmOrdem() {
        if (raiz != null) {
            System.out.print("In.: ");
            exibirEmOrdem(raiz);
            System.out.println();
        }
    }

    private void exibirEmOrdem(noArvore raiz) {
        if (raiz.esquerda != null) {
            exibirEmOrdem(raiz.esquerda);
        }

        System.out.print(raiz.valor + " ");

        if (raiz.direita != null) {
            exibirEmOrdem(raiz.direita);
        }
    }

    public void exibirPosOrdem() {
        long inicio = System.currentTimeMillis();
        if (raiz != null) {
            System.out.print("Post.: ");
            exibirPosOrdem(raiz);
            System.out.println();
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo em ms = "+(fim - inicio));
    }

    private void exibirPosOrdem(noArvore raiz) {

        if (raiz.esquerda != null) {
            exibirPosOrdem(raiz.esquerda);
        }

        if (raiz.direita != null) {
            exibirPosOrdem(raiz.direita);
        }

        System.out.print(raiz.valor + " ");
    }

    public void clean(){
        raiz = null;

    }
}

