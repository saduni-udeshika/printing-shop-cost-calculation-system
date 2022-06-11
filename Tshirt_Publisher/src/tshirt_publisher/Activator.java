package tshirt_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {

	ServiceRegistration serviceReg2;

	public void start(BundleContext context) throws Exception {
		//Activator.context = bundleContext;
		System.out.println("### Card Type Publisher starts..");
		ITshirt obj = new TshirtImpl();
		serviceReg2 = context.registerService(ITshirt.class.getName(), obj, null);
	}

	public void stop(BundleContext context) throws Exception {
		//Activator.context = null;
		System.out.println("### Card Type Publisher stops..");
		serviceReg2.unregister();
	}

}
