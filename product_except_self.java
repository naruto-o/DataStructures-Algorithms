public class product_except_self{
    public static void main(String[] args) {
        int arr[] = {2,4,3,6};
        if (arr.length==0) {
         System.out.println("no solution");   
        }
}
    public static int[] product(int arr[]){
        int []left=new int[arr.length];
        int []right=new int[arr.length];
        left[0]=1;
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i-1]*arr[i-1];
        }
        right[right.length-1]=1;
        for (int i = right.length-2; i>=0; i++) {
            right[i] = right[i+1]*arr[i+1];
        }
        for (int i = 0; i < right.length; i++) {
            arr[i] = left[i]*right[i];
        }
        return arr;
    }
}