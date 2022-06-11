package expenses_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration serviceReg7;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("### Expenses Publisher starts..");
		
		IExpenses obj = new ExpensesImpl();
		serviceReg7 = context.registerService(IExpenses.class.getName(), obj, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("### Expenses Publisher starts..");
		System.out.println("### Card Type Publisher stops..");
		serviceReg7.unregister();
		
	}
}
