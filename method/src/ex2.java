import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.println("Lado 1 -- > ");
        lado1 = sc.nextDouble();
        System.out.println("Lado 2 -- > ");
        lado2 = sc.nextDouble();
        System.out.println("Lado 3 -- > ");
        lado3 = sc.nextDouble();
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            classificar(lado1, lado2, lado3);
        }
        else {
            System.out.println("Valores não formam um triângulo99");
        }

    }

    public static void classificar(double l1, double l2, double l3) {
        if (l1 == l2 && l2 == l3){
            System.out.println("Triângulo equilátero");
        }
        else if(l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("Triângulo isóceles");
        }
        else {
            System.out.println("Triãngulo escaleno");
        }
    }
}
