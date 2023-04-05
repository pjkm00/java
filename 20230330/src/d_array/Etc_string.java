package d_array;

public class Etc_string {

	public static void main(String[] args) {
		
		//문자열 길이
		System.out.println("========문자열길이==========");
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다!";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("==========================");
		
		//문자열 검색
		System.out.println("==========문자열검색=========");
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println("==========================");
		
		//indexOf(), lastIndexOf()
		System.out.println("========indexOf(), lastIndexOf()=========");
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));
		System.out.println(str1.indexOf("a", 8)); //뒤에 파라미터가 시작인덱스임 8번 인덱스부터 서치해라는 뜻
		System.out.println(str1.lastIndexOf("a", 8)); //8을 맨 뒤로 생각하고 앞으로 찾아라
		System.out.println(str2.indexOf("안녕")); 
		System.out.println(str1.lastIndexOf("Bye")); 
		System.out.println("=========================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
