package week5;

public class App {

	public static void main(String[] args) {
		Logger asterisk = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
	
		//System.out.println("AsteriskLogger -");
		asterisk.log("Hello World");
		asterisk.error("Hello World how are you");
		spaced.log("Hello World");
		spaced.error("Hello World");
	}
	
	
}
