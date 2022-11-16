package estruturaDeDados.FilaComPreferencia;

public class filaComPreferencia {
    private no primeiro;
    private no ultimo;
    private int contador;

    public filaComPreferencia() {
        this.primeiro = null;
        this.ultimo = null;
    }


    public void inqueue(Object dado){
        no novoNo = new no();
        novoNo.setDados(dado);
        novoNo.setPreferencia(2);

        if(primeiro == null){
            primeiro = novoNo;
            ultimo = novoNo;

        }else{
            ultimo.setProximo(novoNo);
            ultimo = novoNo;

        }
        contador++;
    }

    public void inqueue(Object dado, int preferencia){
        no novoNo = new no();
        novoNo.setDados(dado);
        novoNo.setPreferencia(preferencia);

        if(primeiro == null){
            primeiro = novoNo;
            ultimo = novoNo;

        }else if(primeiro.getPreferencia() > preferencia){
            novoNo.setProximo(primeiro);
            primeiro = novoNo;

        }else if(ultimo.getPreferencia() <= preferencia){
            ultimo.setProximo(novoNo);
            ultimo = novoNo;

        }else{
            no aux = primeiro;

            while(aux != null && novoNo.getPreferencia() >= aux.getProximo().getPreferencia()){
                aux = aux.getProximo();
            }

            novoNo.setProximo(aux.getProximo());
            aux.setProximo(novoNo);
        }
        contador++;

    }


    public void dequeue(){
        if(primeiro == null)
            return;

        primeiro = primeiro.getProximo();
        contador--;
    }



    public int size(){
        return contador;
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
        if(size() == 0 || indice > size()){
            return null;
        }
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
            System.out.print(primeiro.getDados());
            no aux = primeiro;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
                System.out.print(", " + aux.getDados());
            }
            System.out.println();
        }
    }
}
