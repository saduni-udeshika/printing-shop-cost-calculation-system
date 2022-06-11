package print_card_consumer;
import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import card_publisher.ICard;

public class Activator implements BundleActivator {

	ServiceReference serviceRef1;
	Scanner sc = new Scanner(System.in);
	int val = 0;

	public void start(BundleContext context) throws Exception {
		System.out.println("Concumer started");
		System.out.println();
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		//registering and referencing to get services from the CARD_Type_Publisher bundle.
		serviceRef1 = context.getServiceReference(ICard.class.getName());
		ICard CardObj = (ICard) context.getService(serviceRef1);
		
		while(true) {
			System.out.println();
			System.out.println("### Welcome To Printing Shop ###");
			System.out.println("------------Main Menu------------");
			System.out.println("1). -Printing Cards-");
			System.out.println("2). -Printing Banner-");
			System.out.println("3). -Printing Poster-");
			System.out.println("4). -Printing Leaflets-");
			System.out.println("0). -Exit-");
			System.out.println("----------------------------------");
			System.out.println();
			System.out.print("Enter Menu No : ");
					
			val = sc.nextInt();
			if(val == 1) {
				while(true) {
					System.out.println("*****Printing Card*****");
					CardObj.cardTypeSelection();
					System.out.println();
				}
			}else if (val == 0) {
				break;
			}
			if(val == 2) {
				while(true) {
					System.out.println("*****Printing Banner*****");
					//CardObj.cardTypeSelection();
					System.out.println();
					System.out.println("1. Calculate banner Price");
					System.out.println("2. Exit");
					System.out.print("Enter No : ");
					int n = sc.nextInt();
					
					if(n==1) {
						System.out.println("-----Calculate Banner Pice-----");
					}else if(n == 2){
						break;
					}
					System.out.print("Do you want to Calculate again ? Y/N   ");
					String s = sc.next();

					if (s.equalsIgnoreCase("N")) {
						break;
					} else {
						continue;
					}
				}
			}
			if(val == 3) {
				while(true) {
					System.out.println("*****Printing Poster*****");
					//CardObj.cardTypeSelection();
					System.out.println();
					System.out.println("1. Calculate poster Price");
					System.out.println("2. Exit");
					System.out.print("Enter No : ");
					int n = sc.nextInt();
					
					if(n==1) {
						System.out.println("-----Calculate poster Pice-----");
					}else if(n == 2){
						break;
					}
					System.out.print("Do you want to Calculate again ? Y/N   ");
					String s = sc.next();

					if (s.equalsIgnoreCase("N")) {
						break;
					} else {
						continue;
					}
				}
			
			}
			if(val == 4) {
				while(true) {
					System.out.println("*****Printing Leaflets*****");
					//CardObj.cardTypeSelection();
					System.out.println();
					System.out.println("1. Calculate Leaflets Price");
					System.out.println("2. Exit");
					System.out.print("Enter No : ");
					int n = sc.nextInt();
					
					if(n==1) {
						System.out.println("-----Calculate Leaflets Pice-----");
					}else if(n == 2){
						break;
					}
					System.out.print("Do you want to Calculate again ? Y/N   ");
					String s = sc.next();

					if (s.equalsIgnoreCase("N")) {
						break;
					} else {
						continue;
					}
				}
				}
			
			else if (val == 0) {
				System.out.println("----Thank you----");
				break;
			} else {
				continue;
			}
		}
	}			


	public void stop(BundleContext context) throws Exception {
		System.out.println("### Printing Shop Stop..");
		context.ungetService(serviceRef1);
	}

}
