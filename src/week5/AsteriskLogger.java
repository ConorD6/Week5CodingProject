package week5;

public class AsteriskLogger implements Logger {
	
		public void log(String Hello) {
			System.out.println("***" + Hello + "***");
		}
		public void error(String Hello) {
			String error = "***ERROR: " + Hello + "***";
			String box = "****************"; // 16 asterisks per the projects example
			
			System.out.println(box(Hello));
			System.out.println(error);
			System.out.println(box(Hello));
		}
		public static String box(String starline) {
			String line = "";
			for (int i = 0; i < starline.length() + 13; i++) {
				line+= "*";
			}
			return line;
		}
	}
	

