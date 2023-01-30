public class permutation {
    public static void main(String[] args) {
        String str = "abcd";
        pr(str, "");
    }
    public static void pr(String ques,String ans){
        if (ques.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            String ros = ques.substring(0,i) + ques.substring(i+1);
            char ch = ques.charAt(i);
            pr(ros, ans+ch);
        }
    }
}
