package classAndObject;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student();   //클레스 생성
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구";
		
		Student studentKim = new Student();    //클래스 하나 더 생성
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		//이렇게 클래스를 하나 더 만들어서 사용하는 쪽은 따로 돌리는 경우가 더 많다.
	}
}
