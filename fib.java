public class fib {
    public static void main(String[] args) {
        int n = 6;
        System.out.print(fib(n));
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fb = fib(n-1);
        int fb1 = fib(n-2);
        return fb+fb1;
    }
}
