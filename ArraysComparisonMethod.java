
public class Methods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nums[] = new double[5];
		nums[0] = 10.0;
		nums[1] = 20.0;
		nums[2] = 30.0;
		nums[3] = 40.0;
		nums[4] = 50.0;
		
		double nums2[] = new double[5];
		nums2[0] = 10.0;
		nums2[1] = 20.0;
		nums2[2] = 30.0;
		nums2[3] = 40.0;
		nums2[4] = 5.0;
		
		boolean returnedValue = averageNum(nums, nums2);
		System.out.println(returnedValue);
	}

	public static boolean averageNum(double[] numbers, double[] numbers2) {

		int total = 0;
		int total2 = 0;
		boolean booleanComparison = false;
		
		for (int idx = 1; idx <= numbers.length; idx++) {
			total += numbers[idx-1];
			total2 += numbers2[idx-1];
		}
		
		if (total > total2) {
			booleanComparison = true;
		}
		return booleanComparison;
	}

}
