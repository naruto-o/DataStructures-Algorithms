package recursion;

public class array_recursion {
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,1,3,7,3,6,77};
        int item = 77;
        // search(arr, item);
        System.out.println(search(arr, item,0,arr.length-1));
    }
    public static int search(int []arr,int item,int index,int index2){
        if(index<0){
            return -1;
        }

        if(arr[index] == item){
        return index;
      }  
      if(arr[index2] == item){
        return index2;
      }
      return search(arr,item,index+1,index2-1);
    }
}
