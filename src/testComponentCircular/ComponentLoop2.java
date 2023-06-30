package testComponentCircular;

import annotation.Component;

@Component
public class ComponentLoop2 {
    ComponentLoop3 componentLoop3;

    public ComponentLoop2(ComponentLoop3 componentLoop3) {
        this.componentLoop3 = componentLoop3;
    }
}
