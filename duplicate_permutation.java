public class duplicate_permutation {
        public static void main(String[] args) {
            String str = "abca";
            pr(str, "");
        }
        public static void pr(String ques,String ans){
            if (ques.length()==0) {
                System.out.println(ans);
                return;
            }
            for (int i = 0; i < ques.length(); i++) {
                boolean flag = true;
                char ch = ques.charAt(i);
                for (int j = i+1; j <ques.length(); j++) {
                    if(ques.charAt(j) == ch){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    String ros = ques.substring(0,i) + ques.substring(i+1);
                    pr(ros, ans+ch);
                }
            }
        }
    }

