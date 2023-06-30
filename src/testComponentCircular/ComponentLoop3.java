package testComponentCircular;

import annotation.Component;

@Component
public class ComponentLoop3 {
    ComponentLoop1 componentLoop1;

    public ComponentLoop3(ComponentLoop1 componentLoop1) {
        this.componentLoop1 = componentLoop1;
    }
}
