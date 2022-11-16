package estruturaDeDados.FilaComPreferencia;

public class no {
    private Object dados;
    private no proximo;
    private int preferencia;

    public no() {
        this.proximo = null;
        this.preferencia = 2;
    }

    public int getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(int preferencia) {
        this.preferencia = preferencia;
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
