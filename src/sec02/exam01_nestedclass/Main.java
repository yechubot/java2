package sec02.exam01_nestedclass;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		int field1 = 3;
		c.field2 =19;
		c.method1();
		A.C.method2();
	
		a.method(); // D는 A 클래스의 method()에 들어가 있기 때문에, 참조변수 a로 호출해줘야 한다.
	}
		

}
