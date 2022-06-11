package transport_publisher;

import java.util.Scanner;

public class TransportImpl implements ITransport{
	
	Scanner sc = new Scanner(System.in);
	float distance = 0;
	float cost = 0;
	float weight = 0;
	float costPerKilogram = 20;
	float costPerKilometer = 60;

	@Override
	public void calcDeliveryCost() {
		System.out.println("---Calculate Delivery Cost---");
			System.out.println("Please Enter Distance(Km): ");
			float distance = sc.nextFloat();
			System.out.println("Please Enter Weight of your item: (Kg)");
			float weight = sc.nextFloat();
			
			if(distance < 5 ) {
				if(weight <= 1) {
					cost = 0;
					System.out.println("Free Delivery on your order!");
				}else {
					cost = costPerKilogram * weight;
					System.out.println("Your Delivery charge is " + cost);
				}
			}else if(distance > 5) {
				if(weight < 2) {
					cost = costPerKilometer * distance;
					System.out.println("Your Delivery cost is " + cost);
				}else {
					cost = (costPerKilometer * distance) + (costPerKilogram * weight);
					System.out.println("Your Delivery cost is " + cost);
				}
			}
		}
}
