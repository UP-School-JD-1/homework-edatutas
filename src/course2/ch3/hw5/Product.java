package course2.ch3.hw5;

public class Product extends BaseProduct implements Priceable {

	double basePrice;
	double baseTax;

	public Product(String sku, String description, double baseTax, double basePrice) {
		super(sku, description);
		this.baseTax = baseTax;
		this.basePrice = basePrice;
	}

	@Override
	public void setPrice(double setPrice) {

	}

	@Override
	public void setTax(double setTax) {

	}

	@Override
	public void purchase() {

	}

}
