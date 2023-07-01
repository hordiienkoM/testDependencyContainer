import customEventBus.Subscriber;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String rootPackage = getRootPackage(Main.class);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        List<Subscriber> processors = Arrays.asList(
                new PreProcessSubscriber(), new PostProcessSubscriber()
        );

        IoC.init(rootPackage, classLoader, processors);

        Integer myComponent = 4;
        IoC.registerBean(myComponent);

        Integer beanFromContainer = IoC.getBean(Integer.class);
        System.out.println(beanFromContainer);
    }

    private static String getRootPackage(Class<?> callingClass) {
        String className = callingClass.getName();
        int lastDotIndex = className.lastIndexOf('.');
        return lastDotIndex != -1 ? className.substring(0, lastDotIndex) : "";
    }
}