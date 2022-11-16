package estruturaDeDados.Recursividade;

public class soma {
    public static int soma(int[] v, int i) {
        if (i == v.length - 1)
            return v[i];

        return v[i] + soma(v, i + 1);
    }

    public static void main(String[] args) {
        int vector[] = {9,3,5,7,11,10};

        System.out.println(soma(vector, 0));
    }
}
