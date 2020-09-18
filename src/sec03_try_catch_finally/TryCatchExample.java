package sec03_try_catch_finally;

public class TryCatchExample {
	public static void main(String[] args) {
		int num1 = 35, num2 = 0;
				
		try {	
			int result = num1 / num2;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			String str = e.getMessage();
			System.out.println(str);
			// num2 = 0 인 경우 /by zero 메시지 뜸
		}
	}
}
