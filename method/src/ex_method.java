import java.util.Scanner;

public class ex_method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        int r = multi(x, y);
        System.out.println("Multi = " + r);
    }


    public static int multi(int x, int y){
        int r;
        r = x * y;
        return r;
    }
}
