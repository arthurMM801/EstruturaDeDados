package estruturaDeDados.Recursividade;

public class maior {
    public static int maior(int[] v, int i){
        if (i == v.length-1)
            return v[i];

        int a = maior(v, i+1);
        int b = v[i];

        if(b > a){
            return b;
        }else {
            return a;
        }
    }
    public static void main(String[] args) {
        int vector[] = {1,3,5,7,11,10};

        System.out.println(maior(vector, 0));
    }
}
