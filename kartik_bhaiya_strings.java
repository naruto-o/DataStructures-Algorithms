public class kartik_bhaiya_strings{
    public static void main(String[] args) {
        String str = "abbbaababab";
        int k =3;
        int flipa = maximumlength(str, k,'a');
        int flipb = maximumlength(str, k,'b');
        System.out.println(Math.max(flipa, flipb));
    }
    public static int maximumlength(String str,int k,char ch){
        int si  = 0;
        int ei = 0;
        int ans =0;
        int flip =0;
        while(ei<str.length()){
            //window grow
            if(str.charAt(ei) == ch){
                flip++;
            }
            //window shrink
            while(flip>k && si<=ei){
            if(str.charAt(si) == ch){
                flip --;
            }
            si++;
        }
            //ans calculaet
            ans  = Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}