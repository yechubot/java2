package sec07.exam01_default;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() ����");
		
	}
	
    @Override
    public void method2( ) {
    	System.out.println("MyClassB-method2() ����"); // ����Ʈ �޼ҵ带 ������ �� �� �� ������ �޼ҵ�� �ƴ�.
    }

}
