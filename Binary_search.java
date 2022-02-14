import java.util.Arrays;

public class binarysearchkunal {
    public static void main(String[] args) {
    int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
    int target = -12;
    int ans = binarysearch(arr,target);
    if (ans==-1){
        System.out.println("element not found");
    }
    else {
        System.out.println("found");
    }
        System.out.println(ans);
    }
    //return the index
    static int binarysearch(int[]arr,int target){
       int start =0;
       int end = arr.length-1;
       while (start<=end){
           //find the middle element
//           int mid = (start+end)/2;
             int mid = start+(end-start)/2;//now start +end will not exceed

           if (target<arr[mid]){
               end = mid-1;
           }
           else if (target>arr[mid]){
               start = mid+1;
           }
           else {
               return mid;
           }
       }
