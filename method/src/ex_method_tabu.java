import java.util.Scanner;

public class ex_method_tabu {
    public static void main(String[] args) {
        calcular();
    }

    public static void calcular(){
        Scanner sc = new Scanner(System.in);
        int valor, resultado;
        System.out.println("Informe um valor inteiro ---> ");
        valor = sc.nextInt();
        for (int cont = 0; cont <= valor ; cont++) {
            resultado = valor * cont;
            System.out.println(valor + " x " + cont + " = " + resultado);

        }


    }
}
