package reverseSentence_42;

import java.util.Scanner;

public class LeftRotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String sentence=scanner.nextLine();
		System.out.println(LeftRotate(sentence, 3));
		scanner.close();
	}
	public static String LeftRotate(String str,int index) {
		str=ReverseSentence.Reverse(str, 0, index);
		str=ReverseSentence.Reverse(str, index, str.length()-index);
		str=ReverseSentence.Reverse(str, 0, str.length());
		return str;
	}
}
