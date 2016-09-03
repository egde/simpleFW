package test2;

import javax.inject.Inject;

import de.kazkazi.simple.di.annotations.Singleton;

@Singleton
public class ComponentA {
	
	private ComponentB componentB;

	public ComponentB getComponentB() {
		return componentB;
	}
	
	@Inject
	public void setComponentB(ComponentB componentB) {
		this.componentB = componentB;
	}
	
}
