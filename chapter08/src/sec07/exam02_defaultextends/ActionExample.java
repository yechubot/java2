package sec07.exam02_defaultextends;

public class ActionExample {

	public static void main(String[] args) {
		
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		};
		action.work();

	}

}
