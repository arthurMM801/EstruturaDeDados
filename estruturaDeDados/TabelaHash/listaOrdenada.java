package estruturaDeDados.TabelaHash;

// A lista foi desenvolvida para suportar dados do tipo int e String
public class listaOrdenada {

    private no primeiro;
    private no ultimo;
    private int contador;

    public listaOrdenada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    // O metodo add para int
    public void add(int dado){
        no novoNo = new no();
        novoNo.setDados(dado);

        if(primeiro == null){

            primeiro = novoNo;
            ultimo = novoNo;
        }else if(dado < (int)primeiro.getDados()){

            novoNo.setProximo(primeiro);
            primeiro = novoNo;
        }else if(dado > (int)ultimo.getDados()){

            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }else{
            no aux = primeiro;

            while(aux.getProximo() != null && (int)aux.getDados() > (int)aux.getProximo().getDados()){
                aux = aux.getProximo();

            }

            novoNo.setProximo(aux.getProximo());
            aux.setProximo(novoNo);
        }
        contador++;

    }

    // O metodo add para String
    public void add(String dado){
        if (contains(dado))
            return;
        no novoNo = new no();
        novoNo.setDados(dado);

        if(primeiro == null){

            primeiro = novoNo;
            ultimo = novoNo;
        }else if(dado.compareTo((String) primeiro.getDados()) <= -1){

            novoNo.setProximo(primeiro);
            primeiro = novoNo;
        }else if(dado.compareTo((String) ultimo.getDados()) >= 1){

            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }else{
            no aux = primeiro;

            while(aux.getProximo() != null && ((String)novoNo.getDados()).compareTo((String)aux.getProximo().getDados()) >= 1){
                aux = aux.getProximo();
            }

            novoNo.setProximo(aux.getProximo());
            aux.setProximo(novoNo);
        }
        contador++;

    }


    public Object remove(int indice){
        if(indice >= contador)
            return null;
        if(indice == 0){
            var deletado = primeiro.getDados();

            primeiro = primeiro.getProximo();
            return deletado;
        }else {

            no aux = primeiro;
            for(int i = 0; i < indice-1; i++){
                aux = aux.getProximo();
            }
            var deletado = aux.getProximo().getDados();

            aux.setProximo(aux.getProximo().getProximo());
            return deletado;
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

    // metodo containspara int
    public boolean contains(int numero){
        no aux = primeiro;
        while (aux != null){
            if ((int)aux.getDados() == numero)
                return true;
            aux = aux.getProximo();
        }
        return false;
    }

    // metodo containspara String
    public boolean contains(String elemento){

        no aux = primeiro;
        while (aux.getProximo() != null){
            if (aux.getDados().equals(elemento))
                return true;
            aux = aux.getProximo();
        }

        if (aux.getDados().equals(elemento))
            return true;

        return false;
    }


    public void clear(){
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void show(){

        if(primeiro != null){
            System.out.print(primeiro.getDados());
            no aux = primeiro;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
                System.out.print(" " + aux.getDados());
            }
            System.out.println();
            return;
        }
        System.out.println("A lista esta vazia!");
    }
}
