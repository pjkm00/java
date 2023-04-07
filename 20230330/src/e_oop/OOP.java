package e_oop;

public class OOP {

	public static void main(String[] args) {
		
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 놏고 유지보수가 용이하다.
		 */
		
		SampleClass sc = new SampleClass();	//SampleClass 타입의 변수를 만들어서 주소를 저장함.
											//new SampleClass(); 부분이 객체를 생성
											//이 생성된 객체의 위치를 변수에 저장한 것.
		
		System.out.println(sc.field);
		sc.method1();
		
		String returnValue = sc.method2(10);
		System.out.println(returnValue);
		
		sc.flowTest1();
		
		ClassMaker sc2 = new ClassMaker();
		
		sc2.method();
		
		System.out.println(sc2.intMe());
		
		sc2.method2(50);
		
		System.out.println(sc2.intMe2(10, 5));
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		Calculator cal = new Calculator();
		
		long cSum = cal.sum(123456, 654321);
		System.out.println("1번 답 : " + cSum);
		
		long cMul = cal.mul(cSum, 123456);
		System.out.println("2번 답 : " + cMul);
		
		long cDiv = cal.div(cMul, 123456);
		System.out.println("3번 답 : " + cDiv);
		
		long cSub = cal.sub(cDiv, 654321);
		System.out.println("4번 답 : " + cSub);
		
		long cRem = cal.remain(cSub, 123456);
		System.out.println("5번 답 : " + cRem);
		
		
		
		
	
		
		
	}

}
