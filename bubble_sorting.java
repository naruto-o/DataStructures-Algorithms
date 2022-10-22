public class bubble_sorting {
    public static void main(String[] args) {
    int arr[] = {5,4,3,2,1};
    Sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    }
    public static void Sort(int arr[]){
        for (int pass = 1; pass < arr.length; pass++) { //here passs is equals to 1 because let us consider there
            //  are 50 elements so if we have to sort theeze elements we have to run the loop 49 times 
            for (int i = 0; i < arr.length-pass; i++) { //here we are subtracting pass from the length of the loop because we have to swap the element only that much times
                if(arr[i]>arr[i+1]){
                    int t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                }
            }
        }
    }
}
