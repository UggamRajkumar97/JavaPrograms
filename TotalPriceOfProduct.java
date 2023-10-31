package first;

public class TotalPriceOfProduct {

	public static void main(String[] args) {
		double costOfShoes = Double.parseDouble(args[0]);
		double costOfGrocery = Double.parseDouble(args[1]);
		double costOfprovisions = Double.parseDouble(args[2]);
		boolean isMember = Boolean.parseBoolean(args[3]);
		boolean isCard = Boolean.parseBoolean(args[4]);

		double GST = 18;
		final double DISCOUNT_OF_SHOE = 12;
		final double DISCOUNT_OF_GROCERIES = 8;
		final double DISCOUNT_OF_PROVISIONS = 10;

		double totalCost = 0;

		costOfShoes = costOfShoes + (costOfShoes * GST) / 100 - (costOfShoes * DISCOUNT_OF_SHOE) / 100;
		if (isMember) {
			costOfGrocery = costOfGrocery - (costOfGrocery * DISCOUNT_OF_GROCERIES) / 100;
			costOfprovisions = costOfprovisions - (costOfprovisions * DISCOUNT_OF_PROVISIONS) / 100;
		}
		if (isCard) {
			totalCost = costOfShoes + costOfGrocery + costOfprovisions;
			totalCost = totalCost - (totalCost * 5) / 100;
		}
		else {
			totalCost = costOfShoes + costOfGrocery + costOfprovisions;
		}
		System.out.println(totalCost);

	}

}
