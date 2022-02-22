
public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = new int[9];

		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 99;

		double totalNumber = 0.0;

		for (int idx = 1; idx <= ages.length; idx++) {

			totalNumber = (totalNumber + ages[idx-1]);

		}
		System.out.println(totalNumber / ages.length);
	}

}
