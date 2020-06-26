package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

public class OrderRunner extends BlockJUnit4ClassRunner {

	public OrderRunner(Class<?> testClass) throws InitializationError {
		super(testClass);
	}

	@Override
	protected List<FrameworkMethod> computeTestMethods() {
		List list = super.computeTestMethods();
        List copy = new ArrayList(list);
        Collections.sort(copy, new Comparator() {
            public int compare(Object o1, Object o2) {
            	FrameworkMethod method1 = (FrameworkMethod)o1;
            	FrameworkMethod method2 = (FrameworkMethod)o2;
                return method2.getName().compareTo(method1.getName());
            }
        });
        return copy;
	}
}
