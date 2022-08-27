package course2.ch3.hw5;

public class OldComputer implements Priceable, Locatable {

	String depot;
	String place;
	double price;
	double tax;
	double total = price + tax;

	public OldComputer(String depot, String place, double price, double tax) {
		this.depot = depot;
		this.place = place;
		this.price = price;
		this.tax = tax;
	}

	@Override
	public void setDepot(String setDepot) {
		this.setDepot(depot);

	}

	@Override
	public void setPlace(String setPlace) {
		this.setPlace(place);

	}

	@Override
	public void setPrice(double setPrice) {
		this.setPrice(total);

	}

	@Override
	public void setTax(double setTax) {
		this.setTax(tax);

	}

	@Override
	public void purchase() {
		System.out.println("\nOld Product is purchased at the price of " + price + " with the tax of " + tax
				+ ". And total price is" + total);

	}

}
