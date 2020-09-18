package sec02.exam01_nestedclass;

public class A {
	A() {
		System.out.println("A 객체가 생성됨");
//		B b = new B ();
//		b.field1 = 3;
//		b.method1(); -- 내부에서 접근 시 가능, 외부에서는 따로 만들어야 함.
	}
	
	class B {
		int field1;
		B() {
			System.out.println("B 객체가 생성됨");
		}
		void method1() {};
	}
	
	static class C {
		int field1;
		static int field2;
		C() {
			System.out.println("C 객체가 생성됨");
		}
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D {
			int field1;
			D() {
				System.out.println("D 객체가 생성됨");
			}
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
	
	}

