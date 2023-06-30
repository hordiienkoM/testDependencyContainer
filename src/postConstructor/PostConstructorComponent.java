package postConstructor;

import annotation.Component;
import annotation.PostConstructor;

@Component
public class PostConstructorComponent {
    private void method1() {
        System.out.println("PostConstructor: method1");
    }
    @PostConstructor
    private void method2() {
        System.out.println("PostConstructor: method2");
    }
}
