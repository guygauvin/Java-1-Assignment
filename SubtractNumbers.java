
public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = new int[8];
		int calculatedNumber = 0;

		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;

		calculatedNumber = (calculatedNumber + ages[ages.length-1]-ages[0]);
		System.out.println(calculatedNumber);
	}

}
