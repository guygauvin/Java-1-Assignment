
public class Methods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "Guy";
		String lastName = "Gauvin";
		
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
	}
	public static String createFullName(String firstName, String lastName) {
		String fullName = "";
		fullName = firstName + " " + lastName;
		return fullName;
	}

}
