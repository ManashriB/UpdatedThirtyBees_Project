package thirtybees.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogBase {
	public Logger footerLogs() {

Logger Log = Logger.getLogger(this.getClass());
String path = (System.getProperty("user.dir") + "/src/main/resources/log4jFooter.properties");
PropertyConfigurator.configure(path);
return Log;

		}
     }
