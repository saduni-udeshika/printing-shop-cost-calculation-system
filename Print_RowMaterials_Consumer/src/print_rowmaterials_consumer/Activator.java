package print_rowmaterials_consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import rowmaterials_publisher.IRowmaterial;

public class Activator implements BundleActivator {

	ServiceReference serviceRef8;
	
	Scanner sc = new Scanner(System.in);
	int val = 0;

	public void start(BundleContext context) throws Exception {
		System.out.println("###Row Materials Consumer started###");
		System.out.println();
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		//registering and referencing to get services from the CARD_Type_Publisher bundle.
		serviceRef8 = context.getServiceReference(IRowmaterial.class.getName());
		IRowmaterial RowObj = (IRowmaterial) context.getService(serviceRef8);
		
		while (true) {
			System.out.println("---Calculation of costs for raw materials.---");
			System.out.println();
			System.out.println("1.Calculate  Costs");
			System.out.println("0.Exit");
			
			System.out.println();
			System.out.println("Enter Menu No:");
			
			int menu = sc.nextInt();
			
			if(menu==1) {
				RowObj.calculateCosts();
			}else if(menu==0) {
				break;
			}
			
			  
		}
}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("### Row Materials Consumer Stop..");
		context.ungetService(serviceRef8);
	
	}
}