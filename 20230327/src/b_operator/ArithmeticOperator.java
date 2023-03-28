package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * <<산술연산자>>
		 * - + : 더하기
		 * - - : 뺴기
		 * - * : 곱하기
		 * - / : 나누기
		 * - % : 나머지
		 * - 이항연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		//*, /, % 연산자가 +, - 보다 연산의 우선순위가 높다.
		//우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		System.out.println(a);
		
		double d = 10 + 20.3;
		System.out.println(d);
		
		int value1 = 3;
		value1++;
		System.out.println(value1);
		
		int value2 = 3;
		++value2;
		System.out.println(value2);
		
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3); //4, 3이 나오는 이유는 밸류4에는 밸류3의 3값이 들어가고 그 후에 밸류3이 +1이 되어 들어간다.
		System.out.println(value4);
		System.out.println();

		int value5 = 3;
		int value6 = ++value5;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println();
		
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		System.out.println(value7); //2
		System.out.println(value8); //5
		System.out.println(value9); //10
		System.out.println();
		
		//전위형 덧셈, 뺄셈 연산은 해당 줄에서 바로 연산되어 값이 변한다.
		//후위형 덧셈, 뺄셈 연산은 해당 줄의 다음줄부터 연산되어 값이 변한다.
		
		
	}

}