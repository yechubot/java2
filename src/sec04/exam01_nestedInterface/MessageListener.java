package sec04.exam01_nestedInterface;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("Sending a msg");
		
	}

}
