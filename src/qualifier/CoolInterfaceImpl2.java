package qualifier;

import annotation.Component;

@Component("impl2")
public class CoolInterfaceImpl2 implements CoolInterface{
    String message = "I am impl2";

    @Override
    public String getMessage() {
        return message;
    }
}
