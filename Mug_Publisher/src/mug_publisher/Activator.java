package mug_publisher;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {
	ServiceRegistration serviceReg3;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("### Mug Publisher starts..");
		IMug obj = new MugImpl();
		serviceReg3 = context.registerService(IMug.class.getName(), obj, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("### Mug Publisher stops..");
		serviceReg3.unregister();
	}

}
