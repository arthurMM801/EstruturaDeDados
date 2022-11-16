package estruturaDeDados.ListaOrdenada;

public class no {
    private Object dados;
    private no proximo;

    public no() {
        this.proximo = null;
    }

    public Object getDados() {
        return dados;
    }

    public void setDados(Object dados) {
        this.dados = dados;
    }

    public no getProximo() {
        return proximo;
    }

    public void setProximo(no proximo) {
        this.proximo = proximo;
    }
}
