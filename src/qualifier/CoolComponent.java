package qualifier;

import annotation.Component;
import annotation.Qualifier;

@Component
public class CoolComponent {
    CoolInterface coolInterface;

    public CoolComponent(@Qualifier("impl2") CoolInterface coolInterface) {
//    public CoolComponent(CoolInterface coolInterface) {
        this.coolInterface = coolInterface;
        System.out.println(coolInterface.getMessage());
    }
}
