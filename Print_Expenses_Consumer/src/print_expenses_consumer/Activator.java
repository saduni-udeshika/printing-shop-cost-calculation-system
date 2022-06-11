package print_expenses_consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import expenses_publisher.IExpenses;


public class Activator implements BundleActivator {



	ServiceReference serviceRef7;
	Scanner sc = new Scanner(System.in);
	int val = 0;

	public void start(BundleContext context) throws Exception {
		System.out.println("Expenses Consumer started");
		System.out.println();
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		//registering and referencing to get services from the CARD_Type_Publisher bundle.
		serviceRef7 = context.getServiceReference(IExpenses.class.getName());
		IExpenses obj = (IExpenses) context.getService(serviceRef7);
		
		
			System.out.println();
			System.out.println("### Welcome To Expenses Calculator ###");
			System.out.println("------------Main Menu------------");
			System.out.println("1). -T Shirt-");
			System.out.println("2). --");
			System.out.println("3). --");
			System.out.println("4). --");
			System.out.println("0). -Exit-");
			System.out.println("----------------------------------");
			System.out.println();
			System.out.print("Enter Menu No : ");
					
			val = sc.nextInt();
			if(val == 1) {
				
					System.out.println("*****T shirt Expenses*****");
					obj.tShirtExpenses();
					System.out.println();
		
			}
		
		}
	


	public void stop(BundleContext context) throws Exception {
		System.out.println("### Printing Shop Stop..");
		context.ungetService(serviceRef7);
	}



}
