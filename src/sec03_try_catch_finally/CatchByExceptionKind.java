package sec03_try_catch_finally;

public class CatchByExceptionKind {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+" + "+data2+" = "+result);
			
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
				System.out.println("실행 매개변수 값이 부족하거나 숫자로 변환하는데 실패하였습니다.");
		}catch(Exception e) {
			System.out.println("알 수 없는 예외");
		}
			finally {
			System.out.println("다시 실행해 주세요...");
		}
	}

}
