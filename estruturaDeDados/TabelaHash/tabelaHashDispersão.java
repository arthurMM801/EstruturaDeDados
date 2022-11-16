package estruturaDeDados.TabelaHash;

public class tabelaHashDispersão {
    private Integer[] dados;
    private int contador;

    public tabelaHashDispersão(int n){
        dados = new Integer[n];
        contador = 0;
    }

    public int h(int x){
        return x % dados.length;
    }

    public void add(int elemento){
        if (contador >= dados.length)
            return;

        int i = 1;
        int indice = h(elemento);

        while (dados[indice] != null) {
            indice = h(indice + i);
            i++;
        }
        dados[indice] = elemento;
        contador++;
    }

    public void show(){
        for (int i = 0; i < dados.length; i++){
            System.out.println(dados[i]);
        }
    }

}
