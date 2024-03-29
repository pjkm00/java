package e_oop.score;

public class Student {

	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	int rank;
	
	Student() {
		
	}
	
	Student(int i, String[] a) {
//		name = "학생" + (i + 1);
		name = a[i];
		rank = 1;
		kor = (int)(Math.random()*100)+1;
		eng = (int)(Math.random()*100)+1;
		math = (int)(Math.random()*100)+1;
		sum = kor + eng + math;
		avg = (Math.round((double)sum/3 * 100))/100d;
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg + ", name="
				+ name + ", rank=" + rank + "]";
	}

	Student[] ranking(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length; j++) {
				if(students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}
		
		
		for (int i = 0; i < students.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < students.length; j++) {
				if(students[j].sum > students[min].sum) {
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp;
			
//			System.out.println(students[i].toString());
		}
		return students;
	}
	
	void print(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			System.out.println("이름 : " + students[i].name + " / 국어 : " + students[i].kor + " / 영어 : " + students[i].eng + " / 수학 : " + students[i].math + " / 합계 : " + students[i].sum + " / 평균 : " + students[i].avg + " / 석차 : " + students[i].rank);
		}
	}

	
	
	
}
