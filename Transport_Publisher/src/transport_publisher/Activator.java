package transport_publisher;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	ServiceRegistration serviceReg4;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("### Transport Publisher starts..");
		ITransport transportObj = new TransportImpl();
		serviceReg4 = context.registerService(ITransport.class.getName(),transportObj,null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("### Transport Publisher stops..");
		serviceReg4.unregister();
	}

}
