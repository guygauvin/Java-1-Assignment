
public class Methods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHotOutside = true;
		double moneyInPocket = 100.0;
		
		boolean returnedValue = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(returnedValue);
	}

	public static boolean willBuyDrink(boolean hotOrNot, double moneyOnHand) {

		boolean booleanComparison = false;
		
		if ((hotOrNot) && (moneyOnHand > 10.50)) {
			booleanComparison = true;
		}
		return booleanComparison;
	}

}
