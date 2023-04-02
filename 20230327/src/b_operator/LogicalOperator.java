package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * <<논리연산자>>
		 * - &&(and)  : 피연산자 둘 다 true이면 true를 결과로 얻는다.
		 * - || : 하나라도
		 * - ! : 반대로
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		//a가 0보다 크고 10보다 작거나 같다.
		int a = 6;
		boolean b1 = 0 < a;
		boolean b2 = a <= 10;
		boolean b = b1 && b2;
		System.out.println(b);
		
		//a가 2의 배수이거나 3의 배수인가?
		b = a % 2 == 0 || a % 3 == 0;
		System.out.println(b);
		
		//a가 2의 배수이거나 3의 배수이고 10이상인가?
		b = (a % 2 == 0 || a % 3 == 0) && a >=10; 
		//&&가 ||보다 먼저 수행되기 때문에 문제의 의도와 다르게 되므로 ()를 해준다.
		System.out.println(b);
		
		b = true && true; //true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		
		int d = 10;
		b = d < 10 && 0 < d++; //앞이 거짓이기 때문에 && 뒤에는 읽지 않는다. 
		System.out.println(d); //10
		
		int x = 1, y = 2;
		b = x + 3 * y > y - 2 || x < 3 && y >= 5;
		//산술 논리 비교 모두 있을 때 산술 > 비교 > 논리 순서로 연산됨
		System.out.println(b);
	
		
	
	}

}
