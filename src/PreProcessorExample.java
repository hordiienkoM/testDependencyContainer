import prePostProcessor.ComponentPreProcessor;

public class PreProcessorExample implements ComponentPreProcessor {

    @Override
    public void preProcess(Class<?> aClass) {
        System.out.println("Start class creation: " + aClass.getName() );
    }
}
