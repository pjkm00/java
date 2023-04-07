package e_oop;

public class Calculator {

	//+ - * / % 를 연산해주는 5개의 메서드를 만들어주세요.
	//각각의 메서드는 2개의 파라미터를 받는다. 그 후 결과값 리턴
	
	long sum(long a, long b) {
		return a + b;
	}
	long sub(long a, long b) {
		return a - b;
	}
	long mul(long a, long b) {
		return a * b;
	}
	long div(long a, long b) {
		return a / b;
	}
	long remain(long a, long b) {
		return a % b;
	}
}
