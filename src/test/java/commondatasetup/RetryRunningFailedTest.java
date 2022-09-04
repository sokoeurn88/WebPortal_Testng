package commondatasetup;



import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryRunningFailedTest implements IAnnotationTransformer {
	
	public void transformer(ITestAnnotation annotation, Class testClass, Constructor testConstructure, Method testMethod) {
		annotation.setRetryAnalyzer(RunningFailedTest.class);
	}

}
