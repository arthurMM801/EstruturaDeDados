package estruturaDeDados.ListaDinamicaAnterior;

public class no {
    private Object dados;
    private no proximo;
    private no anterior;

    public no() {
        this.proximo = null;
        this.anterior = null;
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

    public no getAnterior() {
        return anterior;
    }

    public void setAnterior(no anterior) {
        this.anterior = anterior;
    }
}
