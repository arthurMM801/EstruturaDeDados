package estruturaDeDados.Recursividade;
import java.util.Scanner;

public class permuta {
    public static void permuta(String p){
        if(p.length() == 1) {
            System.out.println(p);
            return;
        }


        for(int i = 0; i < p.length();i++){
            
            System.out.print(p.charAt(i));
            permuta(p.substring(0, i) + p.substring(i+1));

        }

    }

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        String p = "ABCD";
        permuta(p);
    }
}
