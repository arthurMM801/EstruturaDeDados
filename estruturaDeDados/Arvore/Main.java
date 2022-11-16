package estruturaDeDados.Arvore;

public class Main {
    public static void main(String[] args) {

        arvoreBinaria arvore = new arvoreBinaria();

        arvore.add(7);
        arvore.add(5);
        arvore.add(12);
        arvore.add(2);
        arvore.add(6);
        arvore.add(9);
        arvore.add(21);
        arvore.add(19);
        arvore.add(25);



        arvore.exibirPosOrdem();


    }

}
