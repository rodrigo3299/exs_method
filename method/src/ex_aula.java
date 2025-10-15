import java.util.Random;

public class ex_aula {
    public static void main(String[] args) {
        int[] v = new int[10];
    }

    public static void somar(int[] v ){
        int soma = 0;
        for (int i : v){
            soma += i;
        }
    }

    public static void imprimir(int [] v){
        for (int i : v){
            System.out.println(i + " ");
        }
    }

    public static void preencher(int [] v){
        Random rd = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(50);
        }
    }

    public static void maiorValor(int[] v){

    }

    public static double calcularMedia(int[] v){
        return (double) somar(v) / v.length;
    }
}
