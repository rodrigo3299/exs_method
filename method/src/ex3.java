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

    public static void maiorValor(int vlr1, int vlr2, int vlr3){
        if (vlr1 > vlr2 && vlr2 < vlr3 && vlr3 < vlr1){
            System.out.println("o maior valor é " +  vlr1);
        }
        else if (vlr1 < vlr2 && vlr2 > vlr3 && vlr3 > vlr1){
            System.out.println("O maior valor é " +  vlr2);
        }
        else{
            System.out.println("O maior valor é " +  vlr3);
        }
    }
}
