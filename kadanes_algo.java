public class kadanes_algo {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-4,-5,-56,7,8};
        kadane(arr);
        System.out.println(kadane(arr));
        

    }
    public static int kadane(int arr[]){
        int ans = Integer.MIN_VALUE;
        int prev_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            prev_sum+=arr[i];
            ans = Math.max(ans, prev_sum);
            if (prev_sum<0) {
                prev_sum = 0;
        }
        }
        return ans;   
    }  
}
