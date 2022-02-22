
public class Methods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nums[] = new double[5];
		nums[0] = 10.0;
		nums[1] = 20.0;
		nums[2] = 30.0;
		nums[3] = 40.0;
		nums[4] = 50.0;
		
		double returnedValue = averageNum(nums);
		System.out.println(returnedValue);
	}

	public static double averageNum(double[] numbers) {

		int total = 0;

		for (int idx = 1; idx <= numbers.length; idx++) {
			total += numbers[idx-1];
		}
		
		return total / numbers.length;
	}

}
