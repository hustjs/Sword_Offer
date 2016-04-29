package reverseSentence_42;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String sentence=scanner.nextLine();
		System.out.println(Reverse_Sentence(sentence));
		scanner.close();
	}
	public static String Reverse_Sentence(String str){
		String[] string=Reverse(str,0,str.length()).split(" ");
		String strRS="";
		for(int i=0;i<string.length;i++){
			strRS=strRS+Reverse(string[i],0,string[i].length())+" ";
		}
		return strRS;
	}
	public static String Reverse(String str,int index,int length){
		char[] ch=str.toCharArray();
		str="";
		for(int i=0;i<index;i++)
			str+=ch[i];
		for(int i=length-1+index;i>index-1;i--)
			str+=ch[i];
		for(int i=length+index;i<ch.length;i++)
			str+=ch[i];
		return str;
	}
}
