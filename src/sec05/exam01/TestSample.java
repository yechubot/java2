package sec05.exam01;

public class TestSample {
	public static void main(String[] args) {
		if(args.length==2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] : "+data1);
			System.out.println("args[1] : "+data2);
		}else if(args.length>=2) {
			System.out.println("2개만 입력하세요");
		}else {
			System.out.println("2개를 입력하세요!!");
		}
	}
		
}
