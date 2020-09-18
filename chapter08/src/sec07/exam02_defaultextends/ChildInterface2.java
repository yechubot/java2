package sec07.exam02_defaultextends;

public interface ChildInterface2 extends ParentInterface {
	
	@Override
	public default void method2() {
		System.out.println("ChildInterace2 - method2() ½ÇÇà");
	}	
	public void method3();
	
	
	
}
