package estruturaDeDados.FilaComPreferencia;

public class Main {
    public static void main(String[] args) {

        filaComPreferencia alunos = new filaComPreferencia();

        alunos.inqueue("roberto",2);
        alunos.show();
        alunos.inqueue("matheus",1);
        alunos.show();
        alunos.inqueue("vanda");
        alunos.show();
        alunos.inqueue("maria clara",1);
        alunos.show();
        alunos.inqueue("gustavo",1);
        alunos.show();
        alunos.inqueue("carlos",0);
        alunos.show();
        alunos.inqueue("larissa",1);
        alunos.show();
        alunos.dequeue();
        alunos.show();
    }

}
