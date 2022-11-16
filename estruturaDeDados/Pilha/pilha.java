package estruturaDeDados.Pilha;

public class pilha {
    private no primeiro;
    private no ultimo;

    public pilha() {
        this.primeiro = null;
        this.ultimo = null;
    }


    public void add(Object dado){
        if(primeiro == null){
            no novoNo = new no();
            novoNo.setDados(dado);

            primeiro = novoNo;
            ultimo = novoNo;
        }else{
            no novoNo = new no();
            novoNo.setDados(dado);

            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }
    }


    public void remove(){
        if(primeiro == null)
            return;

        if(size()==1){
            clear();
            return;
        }


        no aux = primeiro;
        while(aux.getProximo().getProximo() != null){
            aux = aux.getProximo();
        }
        aux.setProximo(null);
        ultimo = aux;
    }

    public int size(){
        int i = 0;
        no aux = primeiro;
        while(aux != null){
            aux = aux.getProximo();
            i++;
        }

        return i;
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

    public no get(int posicao){
        if(posicao > size())
            return null;
        int i = 1;

        no aux = primeiro;
        while (i < posicao){
            aux = aux.getProximo();
            i++;
        }
        return aux;
    }

    public no top(){
        return ultimo;
    }

    public void clear(){
        primeiro = null;
        ultimo = null;
    }

    public void show(){

        if(primeiro != null){
            System.out.print(primeiro.getDados()+" ");
            no aux = primeiro;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
                System.out.print(aux.getDados()+" ");
            }
            System.out.println();
        }
    }
}
