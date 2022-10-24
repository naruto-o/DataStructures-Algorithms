public class maximum_subarray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max_subarray(arr));
    }
    public static int max_subarray(int arr[]){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int previous_sum = 0;
            for (int j = i; j < arr.length; j++) {
                previous_sum+=arr[j];
                Math.max(ans, previous_sum);
            }
        }
            return ans;
    }
}
