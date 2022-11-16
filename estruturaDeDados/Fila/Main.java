package estruturaDeDados.Fila;


public class Main {
    public static void main(String[] args) {
        fila alunos = new fila();

        alunos.inqueue("roberto");
        alunos.inqueue("matheus");
        alunos.inqueue("vanda");
        alunos.inqueue("maria clara");
        alunos.inqueue("gustavo");
        alunos.inqueue("carlos");
        alunos.show();
        alunos.dequeue();
        alunos.show();
    }

}
