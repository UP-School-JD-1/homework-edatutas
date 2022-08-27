package course2.ch3.hw5;

public abstract class BaseProduct {

//	Nesnesi olusturulmasin diye abstract yaptim.

	protected String sku;
	protected String description;

	public BaseProduct(String sku, String description) {
		this.sku = sku;
		this.description = description;

	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
