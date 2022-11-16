package estruturaDeDados.ListaDinamicaAnterior;


public class listaDinamicaAnterior {
    private no primeiro;
    private no ultimo;

    public listaDinamicaAnterior() {
        this.primeiro = null;
        this.ultimo = null;
    }


    public void add(Object dado){
        no novoNo = new no();
        novoNo.setDados(dado);
        novoNo.setAnterior(ultimo);

        if (primeiro==null)//se lista estiver vazia
            primeiro = ultimo = novoNo;
        else {
            //seta proximo do ultimo para receber novoNo
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }
    }


    public void remove(int elemento){
        no pos;
        pos = get(elemento);

        if (pos != null)//1- se existe o No a ser deletado
        {
            if (primeiro != ultimo)//2- se só existe um Nó na lista
            {
                if (pos == primeiro)//3- se o Nó esta no começo
                {
                    primeiro = pos.getProximo();
                    pos.getProximo().setAnterior(null);
                }
                else
                if (pos == ultimo)//4- se o Nó esta no fim
                {
                    ultimo = pos.getAnterior();
                    pos.getAnterior().setProximo(null);
                }
                else//5- se o no esta no meio
                {
                    pos.getAnterior().setProximo(pos.getProximo());
                    pos.getProximo().setAnterior(pos.getAnterior());
                }
                pos.setAnterior(null);
                pos.setProximo(null);
            }
            else
            {
                primeiro = null;
                ultimo = null;
            }
        }
        else
            System.out.println("Elemento nao encontrado");
    }


    public int size(){
        no aux = primeiro;

        int size = 0;

        while(aux != null) {
            aux = aux.getProximo();
        size++;
        }

        return size;
    }

    public boolean empty(){
        if(size() == 0 )
            return true;
        else
            return false;
    }

    public boolean contains(Object elemento){
        no aux = primeiro;
        while (aux.getProximo() != null){
            if (aux.getDados().equals(elemento))
                return true;
            aux = aux.getProximo();
        }
        return false;
    }

    public no get(int elemento){
        no aux = primeiro;

        while ((aux != null) && (aux.getDados().equals(elemento) )) {
            aux=aux.getProximo();
        }

        if ((aux!=null) && (aux.getDados().equals(elemento)))
            return aux;
        else
            return null;
    }

    public void clear(){
        primeiro = null;
        ultimo = null;
    }

    public void show() {

        if (primeiro != null) {
            System.out.print(primeiro.getDados() + " ");
            no aux = primeiro;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
                System.out.print(aux.getDados() + " ");
            }
            System.out.println();
        }
        System.out.println("A lista esta vazia!");
    }
}
