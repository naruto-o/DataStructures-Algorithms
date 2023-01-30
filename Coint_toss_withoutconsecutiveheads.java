public class Coint_toss_withoutconsecutiveheads {
    public static void main(String[] args) {
        int n =3;
        Cointtosshead(n,"");
    }
    public static void Cointtosshead(int n,String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        if(ans.length() == 0 || ans.charAt(ans.length()-1)!='H'){
        Cointtosshead(n-1, ans+"H");
        }
        Cointtosshead(n-1, ans+"T");
    }
}
