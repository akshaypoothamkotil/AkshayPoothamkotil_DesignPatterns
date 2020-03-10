package behavioralMediatorPattern;

public class GameChat {

	public static void showMessage(User user,String Message) {
		System.out.println(user.getName()+": "+Message);
	}
}
