import prePostProcessor.ComponentPostProcessor;

public class PostProcessorExample implements ComponentPostProcessor {
    @Override
    public void postProcess(Class<?> aClass) {
        System.out.println( "class " + aClass.getName() + " created");
    }
}
