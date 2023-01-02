public class Matrix_Search{
    public static void main(String[] args) {
        int [][] arr = {{3,30,38},{10,34,40},{20,42,50}};
        int x = 304;
        System.out.println(Search(arr, x));
    }
    public static int Search(int[][]arr ,int x){
        int row =0;
        int column = arr[0].length-1;       
        while (column >= 0 && row < arr.length){
            if(arr[row][column] == x){
                return 1;
            }
            else if(arr[row][column] < x){
                row++;
            }
            else{
                column--;
            }
        }
        return 0;
    }
}