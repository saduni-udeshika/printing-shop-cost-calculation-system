package print_cost_calculation_consumer;
import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import card_publisher.ICard;
import mug_publisher.IMug;
import sticker_publisher.ISticker;
import tshirt_publisher.ITshirt;

public class Activator implements BundleActivator {

	ServiceReference serviceRef1, serviceRef2, serviceRef3, serviceRef4;
	Scanner sc = new Scanner(System.in);
	int val = 0;

	public void start(BundleContext context) throws Exception {
		System.out.println("Consumer started");
		System.out.println();
		
		//registering and referencing to get services from the CARD_Type_Publisher bundle.
		serviceRef1 = context.getServiceReference(ICard.class.getName());
		ICard CardObj = (ICard) context.getService(serviceRef1);
		
		//registering and referencing to get services from the Mug_Publisher bundle.
		serviceRef3 = context.getServiceReference(IMug.class.getName());
		IMug MugObj = (IMug) context.getService(serviceRef3);
		
		serviceRef4 = context.getServiceReference(ISticker.class.getName());
		ISticker stickerObj = (ISticker) context.getService(serviceRef4);
		
		//registering and referencing to get services from the Tshirt_Publisher bundle.
		serviceRef2 = context.getServiceReference(ITshirt.class.getName());
		ITshirt TshirtObj = (ITshirt) context.getService(serviceRef2);

		
		while(true) {
			System.out.println();
			System.out.println("### Welcome To Printing Shop ###");
			System.out.println("------------Main Menu------------");
			System.out.println("1). -Printing Cards-");
			System.out.println("2). -Printing Mugs-");
			System.out.println("3). -Printing Stickers-");
			System.out.println("4). -Printing T-shirts-");
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
					System.out.println();
					System.out.println("1. Calculate Card Price");
					System.out.println("2. Exit");
					System.out.print("Enter No : ");
					int n = sc.nextInt();
					
					if(n==1) {
						System.out.println("-----Calculate Cards-----");
					}else if(n == 2){
						break;
					}
					System.out.print("Do you want to Calculate again ? Y/N   ");
					String s = sc.next();

					if (s.equalsIgnoreCase("N")) {
						System.out.println("Thank you");
						break;
					} else {
						continue;
					}
					
				}
			
			
				
			}
			if(val == 2) {
		while(true) {
					
					System.out.println("Choose Mug Type");
					System.out.println();
					System.out.println("1). -Magic Mug-");
					System.out.println("2). -Normal Mug-");
					System.out.println("0). -Exit-");
					System.out.println("----------------------------------");
					System.out.println();
					System.out.print("Enter Menu No : ");
					
					int mug = sc.nextInt();
					
					if(mug == 1) {
						MugObj.calcMagicMugCost();
					}else if(mug == 2) {
						MugObj.calcPlaneMugCost();
					}else if(mug == 0) {
						break;
					}
					System.out.print("Do you want to Continue ? Y/N   ");
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
					System.out.println("*****Printing Stiker*****");
					System.out.println();
					System.out.println("*****Printing Sticker*****");
					stickerObj.StickerTypeSelection();
					System.out.println();
					System.out.println("1. Calculate 	Sticker Price");
					System.out.println("2. Exit");
					System.out.print("Enter No : ");
					int n = sc.nextInt();
					
					if(n==1) {
						System.out.println("-----Calculate Sticker-----");
					}else if(n == 2){
						break;
					}
					System.out.print("Do you want to Calculate again ? Y/N   ");
					String s = sc.next();

					if (s.equalsIgnoreCase("N")) {
						System.out.println("Thank you");
						break;
					} else {
						continue;
					}
					
				}
			
			}
			if(val == 4) {
				while(true) {
					
							System.out.println("*****Printing Tshirts*****");
							System.out.println();
							TshirtObj.findTshirtCost();
							System.out.println();
							System.out.println("1. Calculate 	Sticker Price");
							System.out.println("2. Exit");
							System.out.print("Enter No : ");
							int n = sc.nextInt();
							
							if(n==1) {
								System.out.println("-----Calculate Sticker-----");
							}else if(n == 2){
								break;
							}
							System.out.print("Do you want to Calculate again ? Y/N   ");
							String s = sc.next();

							if (s.equalsIgnoreCase("N")) {
								System.out.println("Thank you");
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
		context.ungetService(serviceRef3);
		context.ungetService(serviceRef4);

	}

}
