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
	
		a.method(); // D�� A Ŭ������ method()�� �� �ֱ� ������, �������� a�� ȣ������� �Ѵ�.
	}
		

}
