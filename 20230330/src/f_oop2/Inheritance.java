package f_oop2;

class Human{
	String name;
	int age;
	void eat() {};
	void sleep() {};
}

class Student extends Human{
	int studentID;
	void goToSchool() {};
}

class Worker extends Human{
	int workerID;
	void goWork() {};
}



public class Inheritance {

	
	public static void main(String[] args) {
		//Human 객체 생성
		Human h = new Human();
		h.name = "김민경";
		h.age = 23;
		h.eat();
		h.sleep();
		
		//Student 객체 생성
		Student s = new Student();
		s.name = "서태웅";
		s.age = 17;
		s.studentID = 11;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//Worker 객체 생성
		Worker w = new Worker();
		w.name = "이명헌";
		w.age = 19;
		w.workerID = 4;
		w.eat();
		w.sleep();
		w.goWork();
	}

}
