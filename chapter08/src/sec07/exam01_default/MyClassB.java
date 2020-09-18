package sec07.exam01_default;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
		
	}
	
    @Override
    public void method2( ) {
    	System.out.println("MyClassB-method2() 실행"); // 디폴트 메소드를 재정의 한 것 뿐 디폴드 메소드는 아님.
    }

}
