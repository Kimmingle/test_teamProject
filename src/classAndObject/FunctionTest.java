package classAndObject;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		
		int sum = addNum(num1, num2);    //함수를 호출하여 더하고 sum변수에 담아줌
		System.out.println(sum);
	}
	
	public static int addNum(int n1, int n2) {     //두개 값을 받아 더해주는 addNum함수 만듦
		int result = n1 + n2;
		return result;
	}
	
	
}
