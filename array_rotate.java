import javax.xml.transform.Source;

public class array_rotate{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    public static void rotate(int arr[],int k ){
        k = k%arr.length;
        for (int i = 1; i <=k; i++) {
            int item = arr[arr.length-1];
            for(int j = arr.length-2;j>=0;j--){
                arr[j+1] = arr[j];
            }
            arr[0] = item;
        }
    }
}