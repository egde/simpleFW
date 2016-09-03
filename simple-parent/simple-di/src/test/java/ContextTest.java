import static org.junit.Assert.*;

import org.junit.Test;

import de.kazkazi.simple.di.Context;
import test1.ComponentA;
import test1.ComponentB;

public class ContextTest {

	@Test
	public void test1() {
		Context c = new Context("test1");
		try {
			c.init();
			assertNotNull(c.getSingleton("test1.ComponentA"));
			ComponentB componentB = ((ComponentA)(c.getSingleton("test1.ComponentA"))).getComponentB();
			assertNull(componentB);
			assertNotNull(c.getSingleton("test1.ComponentB"));
		} catch (ReflectiveOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		Context c = new Context("test2");
		try {
			c.init();
			assertNotNull(c.getSingleton("test2.ComponentA"));
			test2.ComponentB componentB = ((test2.ComponentA)(c.getSingleton("test2.ComponentA"))).getComponentB();
			assertNotNull(componentB);
			assertNotNull(c.getSingleton("test2.ComponentB"));
		} catch (ReflectiveOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3() {
		Context c = new Context("test3");
		try {
			c.init();
			assertNotNull(c.getSingleton("test3.ComponentA"));
			test3.ComponentB componentB = ((test3.ComponentA)(c.getSingleton("test3.ComponentA"))).getComponentB();
			test3.ComponentC componentC = ((test3.ComponentA)(c.getSingleton("test3.ComponentA"))).getComponentC();
			assertNotNull(componentB);
			assertNotNull(componentC);
			assertNotNull(c.getSingleton("test3.ComponentB"));
		} catch (ReflectiveOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test4() {
		Context c = new Context("test4");
		try {
			c.init();
			assertNotNull(c.getSingleton("test4.ComponentA"));
			test4.ComponentB componentB = ((test4.ComponentA)(c.getSingleton("test4.ComponentA"))).getComponentB();
			assertNotNull(componentB);
			assertNotNull(c.getSingleton("test4.ComponentB"));
			test4.ComponentC componentC = ((test4.ComponentB)(c.getSingleton("test4.ComponentB"))).getComponentC();
			assertNotNull(componentC);
			assertNotNull(c.getSingleton("test4.ComponentC"));
			assertNotNull(c.getSingleton("test4.ComponentD"));
			assertNotNull(componentC.getComponentD());
		} catch (ReflectiveOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
