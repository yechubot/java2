package sec07.exam02_defaultextends;

public interface ParentInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("ParentInterface-method2()");
	}
}
