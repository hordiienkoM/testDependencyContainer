package autowired;

import annotation.Autowired;
import annotation.Component;
import testComponent.Component1;
import testComponent.Component2;
import testComponent.Component3;

@Component
public class ComponentAutowired {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public ComponentAutowired(Component1 component1) {
        this.component1 = component1;
        System.out.println("Constructor 1 was used");
    }

    public ComponentAutowired(Component2 component2) {
        this.component2 = component2;
        System.out.println("Constructor 2 was used");
    }
    @Autowired
    public ComponentAutowired(Component3 component3) {
        this.component3 = component3;
        System.out.println("Constructor 3 was used");
    }
}
