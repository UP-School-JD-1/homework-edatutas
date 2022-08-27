package course2.ch3.hw5;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		ClothProduct cloth = new ClothProduct("C1", "Sweatshirt", 2, 210, "1.Depot", "2.Floor", "W", "XS");
		FoodProduct food = new FoodProduct("F1", "Watermelon", 1, 40, "3.Depot", "1.Floor", new Date(), 12);
		ConsultancyProduct consultancyProduct = new ConsultancyProduct("CP1", "Consultancy Product", 50, 10000);
		OldComputer oldComputer = new OldComputer("6.Depot", "3.Floor", 15674, 123);
		Gift gift = new Gift("G1", "Sweatshirt", "1.Depot ", "2.Floor");

		cloth.purchase();
		food.toString();
		consultancyProduct.provideConsultingServices();
		oldComputer.purchase();
		gift.toString();

	}

}
