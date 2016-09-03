package test3;

import javax.inject.Inject;

import de.kazkazi.simple.di.annotations.Singleton;

@Singleton
public class ComponentA {
	
	private ComponentB componentB;
	private ComponentC componentC;

	public ComponentB getComponentB() {
		return componentB;
	}
	
	@Inject
	public void setComponentB(ComponentB componentB) {
		this.componentB = componentB;
	}

	public ComponentC getComponentC() {
		return componentC;
	}

	@Inject
	public void setComponentC(ComponentC componentC) {
		this.componentC = componentC;
	}
	
}
