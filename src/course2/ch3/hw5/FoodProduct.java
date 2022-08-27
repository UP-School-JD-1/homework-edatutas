package course2.ch3.hw5;

import java.util.Date;

public class FoodProduct extends Product implements Locatable {

	String depot;
	String place;

	protected Date productionDate;
	protected int life;
	double total = super.basePrice + baseTax;

	public FoodProduct(String sku, String description, double baseTax, double basePrice, String depot, String place,
			Date productionDate, int life) {
		super(sku, description, baseTax, basePrice);
		this.depot = depot;
		this.place = place;
		this.productionDate = productionDate;
		this.life = life;
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

		System.out.println("Food Product " + description + " is purchased at the price of " + basePrice
				+ " with the tax of " + baseTax + ". And total price is " + total);

	}

	@Override
	public String toString() {
		String a= "\nFoodProduct [depot=" + depot + ", place=" + place + ", productionDate=" + productionDate + ", life="
				+ life + ", basePrice=" + basePrice + ", baseTax=" + baseTax + ", total=" + total + ", sku=" + sku
				+ ", description=" + description + "]";
		System.out.println(a);
		return a;
	}
	
	

}
