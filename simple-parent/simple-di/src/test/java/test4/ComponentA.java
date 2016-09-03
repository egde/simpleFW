package test4;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class ComponentA {
	
	@Inject
	private ComponentB componentB;

	public ComponentB getComponentB() {
		return componentB;
	}
	
	public void setComponentB(ComponentB componentB) {
		this.componentB = componentB;
	}
	
}
