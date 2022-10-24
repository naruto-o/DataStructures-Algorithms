public class trapping_rain_water {
    public static void main(String[] args) {
        int[]arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rain_water(arr));
    }
    public static int rain_water(int arr[]){
        int n = arr.length;
        int [] left = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < right.length; i++) {
            left[i] =   Math.max(left[i-1], arr[i]);
        }
        right[n-1] = arr[n-1];
        for (int j = n-2; j>=0; j--) {
            right[j] =  Math.max(right[j+1],arr[j]);
        }
        int ans = 0;
        for (int k = 0; k < right.length; k++) {
            int min = Math.min(left[k], right[k]);
            ans = ans + (min-arr[k]);
        }
        return ans;
       }
}
