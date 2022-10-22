public class reversal_algo {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int k =3;
        rotate_array(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void rotate_array(int[]arr,int k) {
        k=k%arr.length;
        int n = arr.length;
        reverse(0, n-k-1, arr);
        reverse(n-k, n-1, arr);
        reverse(0, n-1, arr);
    }
    public static void reverse(int i ,int j,int[]arr)
    {
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
    }
}
