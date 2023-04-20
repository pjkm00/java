package h_api;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.regex.Pattern;


public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아서 3자리마다 콤마(,)를 붙여 출력해주세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String input = sc.nextLine();
		int count = 0;
		String rev = "";
		
//		for(int i = input.length() - 1; i >= 0; i--) {
//			rev += input.charAt(i);
//			count++;
////			if(count % 3 == 0 && count < input.length()) {
//			if(count % 3 == 0 && i != 0) {
//				rev += ",";
//			}
//		}
//		for(int i = rev.length() - 1; i >= 0; i--) {
//			System.out.print(rev.charAt(i));
//		}
		
		//방법 2
//		for(int i = input.length() - 1; i >= 0; i--) {
//			rev = input.charAt(i) + rev;
//			count++;
//			if(count % 3 == 0 && i != 0) {
//				rev = "," + rev;
//			}
//		}
//		System.out.print(rev);
		
		//방법 3
//		StringBuffer str = new StringBuffer();
//		
//		for(int i = 0; i < input.length(); i++) {
//			rev = input.charAt(i) + rev;
//			count++;
//			if((input.length()-i) % 3 == 0 && i != 0) {
//				str.append(",");
//			}
//			str.append(input.charAt(i));
//		}
//		System.out.println(str);
		
		NumberFormat nf = NumberFormat.getInstance();
		
		String str = nf.format(Integer.parseInt(input));
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
