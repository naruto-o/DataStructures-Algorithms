/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = 5;
		printy(n);
	}
// 	public static void printy(int n){
// 	    if(n == 0){
// 	        return ;
// 	    }
// 	    printy(n-1);
// 	    System.out.println(n);
// 	}
    public static void printy(int n){
	    if(n == 0){
	        return ;
	    }
	    System.out.println(n);
	    printy(n-1);
	    System.out.println(n);
	    
	   // System.out.println(n+1);
	}
}
