public class toh{
    public static void main(String[] args) {
        int n =3;
        printsteps(n,"A","B","C");
    }

    public static void printsteps(int n, String src, String helper, String destination) {
        if(n == 0){
            return;
        }
        printsteps(n-1, src, destination,helper);
        System.out.println("move" +n+ " the disc from " +src+ " to "+destination);
        printsteps(n-1, helper, src, destination);
   
    }
}