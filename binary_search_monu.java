public class binary_search_monu{
    public static void main(String[] args) {
        int arr[] = {3,5,7,9,10,12,15,17};
        int item = 45;
        System.out.println(Search(arr, item));
    }
    public static int Search(int arr[],int item){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == item){
                return mid;
            }
            else if(arr[mid] > item){
                high = mid -1;
            }
            else{
                //arr[mid]<item
                low = mid+1;
            }
        }
        return -1;
    }
}