package b_operator;

public class Etc {

	public static void main(String[] args) {
		/*
		 * <<기타연산자>>
		 * - . (참조연산자)  : 특정 범위 내에 속해있는 멤버를 지칭할 때 사용한다.
		 * - (type)        : 형 변환(casting)
		 * - ?: (삼항연산자) : 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 * - instanceof    : 참조형 타입 확인
		 */
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y;
		System.out.println(result);
		
		//점수가 60점 이상이면 "합격", 미만이면 "불합격"
		int score = 50;
		String res = score >= 60 ? "합격" : "불합격";
		System.out.println(score + "점은 " + res + "입니다.");
		
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1,3이면 "남자", 2,4이면 "여자"
		int regNo = 5; //주민등록번호 뒷자리의 첫자리
		String gender = regNo == 1 || regNo == 3 ? "남자" : "여자";
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		gender = regNo == 1 || regNo == 3 ? "남자" : regNo == 2 || regNo == 4 ? "여자" : "확인불가";
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		String str = "test";
		System.out.println(str instanceof String);
		
		
		
		
	}
}
