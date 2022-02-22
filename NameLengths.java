
public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[5];
		int nameLengths[] = new int[5];
		int nameLength = 0;
		//int idx = 0;
		
		names[0] = "Tommy";
		names[1] = "Tim";
		names[2] = "Sally";
		names[3] = "Buck";
		names[4] = "Bob";

		for (int idx = 1; idx <= names.length; idx++) {
			nameLength = names[idx-1].length();
			nameLengths[idx-1] = nameLength;
			System.out.println(nameLengths[idx-1]);
		}
	}

}
