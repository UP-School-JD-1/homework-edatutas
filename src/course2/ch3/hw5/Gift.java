package course2.ch3.hw5;

public class Gift extends BaseProduct implements Locatable {

	String depot;
	String place;

	public Gift(String sku, String description, String depot, String place) {
		super(sku, description);
		this.depot = depot;
		this.place = place;

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
	public String toString() {
		String a = "\nGift [depot=" + depot + ", place=" + place + ", sku=" + sku + ", description=" + description + "]";
		System.out.println(a);
		return a;
	}

}
