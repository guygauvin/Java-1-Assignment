
public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[5];
		int calculatedNumber = 0;
		int individualNumber = 0;

		names[0] = "Tommy";
		names[1] = "Tim";
		names[2] = "Sally";
		names[3] = "Buck";
		names[4] = "Bob";

		for (int idx = 1; idx <= names.length; idx++) {
	
			individualNumber = names[idx-1].length();
			calculatedNumber = (calculatedNumber + individualNumber);

		}
		//System.out.println(names[].length());
		System.out.println(calculatedNumber / names.length);
	}

}
