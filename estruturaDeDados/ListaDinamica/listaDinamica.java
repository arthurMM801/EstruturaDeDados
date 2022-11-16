package estruturaDeDados.ListaDinamica;

public class listaDinamica {
    private no primeiro;
    private no ultimo;
    private int contador;

    public listaDinamica() {
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
        contador++;
    }

    public void add(int indice, Object dado){
        if(primeiro == null){
            no novoNo = new no();
            novoNo.setDados(dado);

            primeiro = novoNo;
            ultimo = novoNo;
        }else if (indice == contador-1){
            no novoNo = new no();
            novoNo.setDados(dado);

            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }else{
            no aux = primeiro;
            for(int i = 0; i < indice-1; i++){
                aux = aux.getProximo();
            }
            no novoNo = new no();
            novoNo.setDados(dado);
            novoNo.setProximo(aux.getProximo());

            aux.setProximo(novoNo);
        }
        contador++;
    }

    public void remove(int indice){
        if(indice >= contador)
            return;
        if(indice == 0){
            primeiro = primeiro.getProximo();
        }else {
            no aux = primeiro;
            for(int i = 0; i < indice-1; i++){
                aux = aux.getProximo();
            }
            aux.setProximo(aux.getProximo().getProximo());
        }

    }

    public int size(){
        return contador;
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

    public Object getDados(int indice){
        if(empty() || indice > size())
            return null;


        int i = 1;
        no aux = primeiro;
        while (aux != null) {
            if (indice == i) {
                return aux.getDados();
            }
            aux = aux.getProximo();
            i++;
        }

        return aux.getDados();
    }

    public void clear(){
        primeiro = null;
        ultimo = null;
        contador = 0;
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
        System.out.println("A lista esta vazia!");
    }
}
