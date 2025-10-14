import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Informe um valor");
        valor = sc.nextInt();
        if (valor < 0){
            System.out.println("O valor deve ser positivo");
        }
        else {
            imprimir(valor);
        }

    }

    public static void imprimir(int valor) {
        for (int cont = 1; cont <= valor; cont++){
            if(valor % cont == 0){
                System.out.println(-cont + " " + cont);
            }
        }
    }
}
