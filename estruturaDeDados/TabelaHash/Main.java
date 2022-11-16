package estruturaDeDados.TabelaHash;

public class Main {
    public static void main(String[] args) {
        //tabelaHashLinear tabela = new tabelaHashLinear(8);
        //tabelaHashDispersão tabela = new tabelaHashDispersão(8);
        tabelaHashFechada tabela = new tabelaHashFechada(8);

        tabela.add(1);
        tabela.add(2);
        tabela.add(3);
        tabela.add(11);
        tabela.add(19);
        tabela.add(27);
        tabela.add(24);
        tabela.add(21);
        tabela.add(11);
        tabela.add(22);
        tabela.add(31);
        tabela.add(121);
        tabela.add(129);
        tabela.add(237);
        tabela.add(241);
        tabela.add(2);

        tabela.show();


    }
}
