public class boradpath_dice {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("\n"+Boardpath(n, 0, ""));
    }
    public static int Boardpath(int end,int curr,String ans){
        if(curr == end){
            System.out.println(ans+" ");
            return 1;
        }
        if(curr>end){
            return 0;
        }
            // int fs = Boardpath(end, curr+1, ans+1);
            // int ss = Boardpath(end, curr+2, ans+2);
            // int ts = Boardpath(end, curr+3, ans+3);
            int count =0;
            for(int dice =1;dice<=3;dice++){
                count += Boardpath(end, curr+dice, ans+dice);    
            }
            return count;
    }
}

