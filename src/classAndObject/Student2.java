package classAndObject;

public class Student2 {
	
	int studentID;
	String studentName;
	Subject korea;     //참조 자료형
	Subject math;

	
	public Student2() {    
		korea = new Subject();  //선언만 한다고 클래스 생성되지 않기 때문에 
		math = new Subject();  //subject로 생성해줌(각 과목에 대한 인스턴스 생성 됨)
								//원래는 Subject korea = new Subject() 인가봄?
		
	}
	
	public Student2(int id, String name) { 
		studentID = id;
		studentName = name;
		
		korea = new Subject(); 
		math = new Subject();  
	}

}
