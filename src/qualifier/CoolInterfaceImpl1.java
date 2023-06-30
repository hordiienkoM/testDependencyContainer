package qualifier;

import annotation.Component;

@Component("impl1")
public class CoolInterfaceImpl1 implements CoolInterface {
    String message = "I am impl1";

    @Override
    public String getMessage() {
        return message;
    }
}
