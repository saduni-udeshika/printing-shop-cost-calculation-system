package card_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceReg;

	public void start(BundleContext context) throws Exception {
		System.out.println("### Card Type Publisher starts..");
		ICard obj = new CardImpl();
		serviceReg = context.registerService(ICard.class.getName(), obj, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("### Card Type Publisher stops..");
		serviceReg.unregister();
	}

}
