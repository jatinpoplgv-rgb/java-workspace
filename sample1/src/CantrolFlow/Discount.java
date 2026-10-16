package CantrolFlow;

public class Discount {

	public static void main(String[] args) {

		Discount d1 = new Discount();
		String customerType = args[0];

		int purchase = Integer.parseInt(args[1]);
		d1.discount(customerType, purchase);

	}

	public void discount(String customerType, int purchase) {
		if (purchase <= 1000) {
			System.out.println("Discount not applied");
			return;
		}

		int totalAmount = 0;
		int discount1 = 0;

		switch (customerType) {
		case "GOLD":

			discount1 = purchase * 20 / 100;

			if (discount1 > 2500) {
				discount1 = 2500;
			}
			totalAmount = purchase - discount1;
			System.out.println("your amount : " + purchase);
			System.out.println("you have got discount of ruppes : " + discount1);
			System.out.println("TotalAmount : " + totalAmount);
			break;
		case "SILVER":

			discount1 = purchase * 15 / 100;

			if (discount1 > 2500) {
				discount1 = 2500;
			}
			totalAmount = purchase - discount1;
			System.out.println("your amount : " + purchase);
			System.out.println("you have got discount of ruppes : " + discount1);
			System.out.println("TotalAmount : " + totalAmount);
			break;
		case "REGULAR":

			discount1 = purchase * 5 / 100;

			if (discount1 > 2500) {
				discount1 = 2500;
			}
			totalAmount = purchase - discount1;
			System.out.println("your amount : " + purchase);
			System.out.println("you have got discount of ruppes : " + discount1);
			System.out.println("TotalAmount : " + totalAmount);
			break;

		default:
			break;
		}
	}
}
