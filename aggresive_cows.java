import java.util.*;
public class aggresive_cows{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt();
        while(t-->0){
            int nos = sc.nextInt();
            int noc = sc.nextInt();
            int []stall = new int[nos];
            for (int i = 0; i < stall.length; i++) {
                stall[i] = sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(Largestmindist(stall, noc));
        }
    }
    public static int Largestmindist(int []stall,int noc){
        int lo = 0;
        int hi = stall[stall.length-1] -stall[0];
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (isitpossible(stall,mid,noc)==true) {
                int ans = mid;
                lo = mid +1;
            }
            else{
                hi = mid -1;
            }
        }
        return hi;
    
    }
    public static boolean isitpossible(int[]stall,int noc,int mid){
        int cows =1;
        int position = stall[0];
        int i =1;
        while(i<stall.length){
            if(stall[i] - position>=mid){
                cows++;
                position = stall[i];
            }
            if(cows == noc){
                return true;
            }
            i++;
        }
        return false;
    }
}