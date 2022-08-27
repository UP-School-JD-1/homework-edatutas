package course2.ch3.hw5;

public class ClothProduct extends Product implements Locatable {

	String depot;
	String place;

	protected String sex;
	protected String size;
	double total = super.basePrice + baseTax;

	public ClothProduct(String sku, String description, double baseTax, double basePrice, String depot, String place,
			String sex, String size) {
		super(sku, description, baseTax, basePrice);

		this.depot = depot;
		this.place = place;
		this.sex = sex;
		this.size = size;
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
		super.setPrice(super.basePrice + baseTax);
	}

	@Override
	public void setTax(double setTax) {
		super.setTax(super.baseTax);
	}

	@Override
	public void purchase() {

		System.out.println(
				"Cloth Product " + description + " for " + sex + " and size " + size + " is purchased at the price of "
						+ basePrice + " with the tax of " + baseTax + ". And total price is " + total);

	}

}
