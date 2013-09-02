package util.impl




import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import util.CashTransaction;

class Activator extends BundleActivator {

  def start(context: BundleContext) {
    println("adding cashtransaction service to OSGI")
    context.registerService(classOf[CashTransaction].getName, new CashTransactionImpl(), null)
  }

  def stop(context: BundleContext) {
    println("shutting down! removing cashtransaction service")
  }
}
