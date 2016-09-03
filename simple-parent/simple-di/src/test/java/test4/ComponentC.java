package test4;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ComponentC {

	private ComponentD componentD;

	public ComponentD getComponentD() {
		return componentD;
	}

	@Inject
	public void setComponentD(ComponentD componentD) {
		this.componentD = componentD;
	}
}
