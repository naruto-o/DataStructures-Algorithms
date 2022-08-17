import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fib = sc.nextInt();
        if(fib == 0){
            System.out.println(0);
        }
        if(fib == 1){
            System.out.println(1);
        }
        int a = 0; int b = 1;
        int sum = a+b;
        for (int i = 0; i < fib; i++) {
             sum = a + b;
            // System.out.println(sum);
            a = b;
            b = sum;
        }
        System.out.println(a);
    }
}
