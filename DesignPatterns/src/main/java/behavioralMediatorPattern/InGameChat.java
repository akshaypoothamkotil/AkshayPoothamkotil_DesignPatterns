package behavioralMediatorPattern;

public class InGameChat {
public static void main(String []args) {
	User akshay=new User("Akshay P");
	User anu=new User("Anu");
	
	
	akshay.sendMessage("Hello Anu!!");
	anu.sendMessage("Hello Akshay..");
	
}
}
