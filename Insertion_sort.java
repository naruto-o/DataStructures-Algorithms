public class Insertion_sort {
    public static void main(String[] args) {
      int arr[] ={8,9,4,2,1,11,89};
      Sort(arr);
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }  
    }
    public static void Sort(int[]arr){
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
