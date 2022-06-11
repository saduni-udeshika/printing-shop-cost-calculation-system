package tranport_consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import transport_publisher.ITransport;

public class Activator implements BundleActivator {
	ServiceReference serviceRef5;
	Scanner sc = new Scanner(System.in);
	int choice = 0;

	public void start(BundleContext context) throws Exception {
		System.out.println("Transport Consumer Star..");
		System.out.println();
		
		//registering and referencing to get services from the Transport_Publisher bundle.
		serviceRef5 = context.getServiceReference(ITransport.class.getName());
		ITransport transportObj = (ITransport) context.getService(serviceRef5);
		
		while(true) {
			System.out.println("----Calculate Delivery Cost:-----");
			System.out.println();
			System.out.println("1). -Calculate Delivery Cost-");
			System.out.println("0). -Exit-");
			System.out.println("----------------------------------");
			System.out.println();
			System.out.print("Enter Menu No : ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				transportObj.calcDeliveryCost();
			}else if(choice == 0){
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

	public void stop(BundleContext context) throws Exception {
		System.out.println("Transport Consumer Stop..");
		context.ungetService(serviceRef5);
	}

}
