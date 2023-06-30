package testComponentCircular;

import annotation.Component;

@Component
public class ComponentLoop1 {
    ComponentLoop2 componentLoop2;
    ComponentLoop1 (ComponentLoop2 componentLoop2) {
        this.componentLoop2 = componentLoop2;
    }
}
