package test1;

import de.kazkazi.simple.di.annotations.Singleton;

@Singleton
public class ComponentA {

	private ComponentB componentB;

	public ComponentB getComponentB() {
		return componentB;
	}

	public void setComponentB(ComponentB componentB) {
		this.componentB = componentB;
	}
	
}
