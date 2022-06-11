package rowmaterials_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration serviceReg8;

	public void start(BundleContext context) throws Exception {
		//Activator.context = bundleContext;
		System.out.println("### Row Materials Publisher starts..");
		IRowmaterial obj = new RowmaterialImpl();
		serviceReg8 = context.registerService(IRowmaterial.class.getName(), obj, null);
	}

	public void stop(BundleContext context) throws Exception {
		//Activator.context = null;
		System.out.println("###  Row Materials Publisher stops..");
		serviceReg8.unregister();
	}

}
