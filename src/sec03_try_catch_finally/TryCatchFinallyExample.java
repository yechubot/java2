package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");// �̷� Ŭ���� �̸� �ִ�
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}
		
	
	}

}
