package course2.ch3.hw5;

public class ConsultancyProduct extends Product {

	double total = super.basePrice + baseTax;

	ConsultancyProduct(String sku, String description, double baseTax, double basePrice) {
		super(sku, description, baseTax, basePrice);
	}

	void provideConsultingServices() {
		System.out.println("\nConsultancy service is provided.....");
	}

	@Override
	public String toString() {
		return "ConsultancyProduct [sku = " + sku + ", description=" + description + ", basePrice=" + basePrice
				+ ", baseTax=" + baseTax + ", total=" + total + "]";
	}

}
