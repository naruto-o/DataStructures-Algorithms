package com.company;

public class Linearsearchkunal {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = -11;
        int ans = linearsearch(nums, target);
        System.out.println(ans);

    }
            //search in the array : return the index if item found
           //otherwise if item not found  return -1
    static int linearsearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
    //run a FOR LOOP
        for(int index =0;index<arr.length;index++){
            //check for element at every index
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return
        // statements above has executed hence the target not found
    return -1;
    }
}
