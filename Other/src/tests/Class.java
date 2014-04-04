package tests;

public class Class {

	/**
	 * @param args
	 */
	private static String str;
	public static void main(String[] args) {

		str = "Hello";
		str = changeStr(str);
		System.out.println(str);
		

	}
	public static String changeStr(String str){
		
		str = "Goodbye";
		return str;
		
	}
	
}
