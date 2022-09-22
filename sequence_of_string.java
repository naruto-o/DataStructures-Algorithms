public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        String str = "abc";
        String ans = "";
        printpermutation(str,"");
        
	}
	public static void printpermutation(String str,String ans){
	    if(ques.length()==0){
	        System.out.println(ans);
	        return;
	    }
	   char ch = ques.charAt(0);
	   printpermutation(ques.substring(1),ans);
	    printpermutation(ques.substring(1),ans+ch);
	}
}
