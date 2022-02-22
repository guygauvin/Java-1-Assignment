
public class Methods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = new int[5];
		nums[0] = 10;
		nums[1] = 10;
		nums[2] = 10;
		nums[3] = 10;
		nums[4] = 90;
		
		boolean returnedValue = booleanReturned(nums);
		System.out.println(returnedValue);
	}

	public static boolean booleanReturned(int[] numbers) {
		boolean trueOrFalse = false;
		int total = 0;

		for (int idx = 1; idx <= numbers.length; idx++) {
			total = total + numbers[idx-1];
		}
		if (total > 100) {
			trueOrFalse = true;
		}
		
		return trueOrFalse;
	}

}
