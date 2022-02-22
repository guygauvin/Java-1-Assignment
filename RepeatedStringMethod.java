
public class Methods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String returnedString = repeatString("Hello", 3);
		System.out.println(returnedString);
	}
	public static String repeatString(String word, int n) {
		String repeatedString = "";
		for (int l = 1; l <= n; l++) {
			repeatedString = repeatedString + word;
		}
		return repeatedString;
	}

}
