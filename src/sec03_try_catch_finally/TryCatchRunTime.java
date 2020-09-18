package sec03_try_catch_finally;

public class TryCatchRunTime {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("매개값 부족");
		System.out.println("실행방법");
		System.out.println("java class name num1 num2");
		return;
	}
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + "+ data2 +" = "+result);			
		}catch (NumberFormatException e) {
			System.out.println("숫자 변환에 실패하였습니다.");
		}finally {
			System.out.println("다시 실행시켜 주세요");
		}

}
}