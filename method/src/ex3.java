import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3;
        System.out.println("Digite o valor 1 = ");
        valor1 = sc.nextInt();
        System.out.println("Digite o valor 2 = ");
        valor2 = sc.nextInt();
        System.out.println("Digite o valor 3 = ");
        valor3 = sc.nextInt();

        maiorValor(valor1 , valor2, valor3);
    }

    public static void maiorValor(int valor1, int valor2, int valor3){
        if (valor1 > valor2 && valor1 > valor3){
            System.out.println("o maior valor é " + valor1);
        }
        else if (valor1 < valor2 && valor2 > valor3 ){
            System.out.println("O maior valor é " + valor2);
        }
        else{
            System.out.println("O maior valor é " + valor3);
        }
    }
}
