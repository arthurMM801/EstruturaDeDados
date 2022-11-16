package estruturaDeDados.TabelaHash;

public class tabelaHashLinear {
    Integer[] dado;
    int contador;

    public tabelaHashLinear(int n){
        dado = new Integer[n];
        contador = 0;
    }

    public int h(int x){
        return x % dado.length;
    }

    public void add(int elemento){
        if (contador >= dado.length)
            return;

        int i = 1;
        int indice = h(elemento);

        while (dado[indice] != null) {
            indice = h(elemento + i);
            i++;
        }
        dado[indice] = elemento;
        contador++;

    }

    public void show(){
        for (int i = 0; i < dado.length; i++){
            System.out.println(dado[i]);
        }
    }
}
