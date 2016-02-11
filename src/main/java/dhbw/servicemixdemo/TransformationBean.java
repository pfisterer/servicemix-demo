package dhbw.servicemixdemo;

import java.util.Date;
import java.util.logging.Logger;

public class TransformationBean {
	private static final transient Logger logger = Logger.getLogger(TransformationBean.class.getName());
	private boolean verbose = true;
	private String prefix = "DefaultPrefix: ";

	public Object transform(Object body) {
		String resultObject = prefix + ": " + body + " @ " + new Date();
		logger.info("Result object: " + resultObject);
		return resultObject;
	}

	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
