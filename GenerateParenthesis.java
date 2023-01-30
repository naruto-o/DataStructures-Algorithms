import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n =3;
        List<String> list = new ArrayList<>();
        GP(n,0,0,"",list);
        System.out.println(list);
    }
    public static void GP(int n,int open,int close,String ans,List<String> list){
        if(open == n && close == n){
            // System.out.println(ans);
            list.add(ans);
            return;
        }
        if(open < n){
        GP(n, open+1, close, ans+"(",list);
        }
        if(close < open){
        GP(n, open, close+1, ans+")",list);
        }
    }
}
