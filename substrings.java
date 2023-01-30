public class substrings{
    public static void main(String[] args) {
        String str = "NITIN";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String s1 = str.substring(i, j);
                if (isPalindrome(s1)==true) {
                    System.out.println(s1);
                }
                // System.out.println(str.substring(i,j));
            }
        }
    }
    public static boolean isPalindrome(String str){
            int  i = 0;
            int j = str.length()-1;
            while(i<j){
                if(str.charAt(i) != str.charAt(j)){
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
            return true ;
    }
}