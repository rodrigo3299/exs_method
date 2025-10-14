import java.util.Scanner;

public class ex_method_raiz_quad {
    public static void main(String[] args) {
        calcular();
    }

    public static void calcular(){
        Scanner sc = new Scanner(System.in);
        int valor, resultado;
        System.out.println("Informe um valor inteiro ---> ");
        valor = sc.nextInt();


        double raizQuadradaDe100 = Math.sqrt(100);


        for (int math = 0; math <= valor; math++) {
            resultado = (int)(valor * math * raizQuadradaDe100);
            System.out.println(valor + " x " + math + " = " + resultado);
        }
    }
}

