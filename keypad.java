import java.util.ArrayList;
import java.util.List;
public class keypad{

	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12";
        List<String> list = new ArrayList<>();
		printKeyPaid(str, "",list);
        System.out.println(list);

	}

	public static void printKeyPaid(String ques, String ans,List<String> list) {// 12
		if (ques.length() == 0) {
			// System.out.print(ans + " ");
            list.add(ans);
			return;
		}

		char ch = ques.charAt(0);// '1'--> 49
		String pressString = key[ch - 47];// ch-->49

		for (int i = 0; i < pressString.length(); i++) {
			printKeyPaid(ques.substring(1), ans + pressString.charAt(i),list);

		}

	}

}