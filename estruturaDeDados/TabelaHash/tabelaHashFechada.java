package estruturaDeDados.TabelaHash;

public class tabelaHashFechada {
    private listaOrdenada dados[];

    public tabelaHashFechada(int n){
        dados = new listaOrdenada[n];
        for (int i = 0; i < n; i++){
            dados[i] = new listaOrdenada();
        }
    }

    public void add(int elemento){
        if(!contains(elemento))
            dados[elemento % dados.length].add(elemento);
    }

    public boolean contains(int elemento){
        return dados[elemento % dados.length].contains(elemento);
    }

    public void show(){
        for (int i = 0; i < dados.length; i++){
            dados[i].show();
        }
    }
}
