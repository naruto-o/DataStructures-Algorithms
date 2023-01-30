public class Maze_path {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        printpath(m-1,n-1,0,0,"");
    }
    public static void printpath(int er,int ec,int cr,int cc,String ans){
        //er = end row,ec= end column,cr = current row,cc = current column
        if (er == cr && ec == cc) {
            System.out.println(ans+" ");
            return;
        }
        if(cr > ec || cc > ec){
            return;
        }
        printpath(er, ec, cr, cc+1, ans+"H");
        printpath(er, ec, cr+1, cc, ans+"V");
    }
}
