package test4;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ComponentB {

	private ComponentC componentC;

	public ComponentC getComponentC() {
		return componentC;
	}

	@Inject
	public void setComponentC(ComponentC componentC) {
		this.componentC = componentC;
	}
	
}
