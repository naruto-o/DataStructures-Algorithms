public class first_bad_version {
    public static void main(String[] args) {
        int n =5;
    }
    public static int badversion(int n){
        int lo = 0;
        int hi = n;
        int ans = 0;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(isBadVersion(mid) == true){
                ans  = mid;
                hi = mid -1;
            }
            else{
                    lo = mid +1;
            }
        }
        return ans
    }
}
