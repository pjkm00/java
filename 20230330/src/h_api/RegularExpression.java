package h_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	: 뒷문자로 시작
		 * $	: 앞문자로 종료
		 * .	: 임의의 문자(줄바꿈제외) 
		 * *	: 앞문자가 0개 이상
		 * +	: 앞문자가 1개 이상
		 * ?	: 앞 문자가 없거나 1개
		 * []	: 앞문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z까지가 아닌것)
		 * {}	: 앞문자의 개수({2} : 2개, {2, 4} : 2개 이상 4개 이하)
		 * ()	: 그룹화(1개의 문자처럼 인식)
		 * |	: OR연산
		 * \s	: 공백, 탭, 줄바꿈
		 * \S	: 공백, 탭, 줄바꿈이 아닌 문자
		 * \w	: 알파벳이나 숫자
		 * \W	: 알파벳이나 숫자가 아닌 문자
		 * \d	: 숫자
		 * \D	: 숫자가 아닌 문자
		 * (?!)	: 뒷문자의 대소문자 구분 안함
		 * \	: 정규표현식에서 사용되는 특수문자 표현
		 * ?= 	: 전방 탐색기호
		 */

		String str = "abcD123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-zA-Z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		System.out.println(m.matches());
	
		//아이디, 전화번호, 이메일주소, 비밀번호의 유효성을 검사하는 정규표현식을 만들어주세요
		String id = "pjkm00";
		String pwd = "sdfvddDd3";
		String phone = "010-8771-4407";
		String email = "pjkm00@naver.com";
	
		String idre = "[a-zA-Z0-9]{6,15}";
		String pwdre = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,20}";
		String phonere = "0[0-9]{1,3}-{1}[0-9]{4}-{1}[0-9]{4}";
		String emailre = "[a-z0-9]+@[\\w]+[.]com";
		
		//주민등록번호 
		// \d{6}-[1-4]{1}\d{6}
		
		Pattern idp = Pattern.compile(idre);
		Pattern pwdp = Pattern.compile(pwdre);
		Pattern phonep = Pattern.compile(phonere);
		Pattern emailp = Pattern.compile(emailre);
		
		Matcher idm = idp.matcher(id);
		Matcher pwdm = pwdp.matcher(pwd);
		Matcher phonem = phonep.matcher(phone);
		Matcher emailm = emailp.matcher(email);
		
		System.out.println(idm.matches());
		System.out.println(pwdm.matches());
		System.out.println(phonem.matches());
		System.out.println(emailm.matches());
		
		
	
	}

}
