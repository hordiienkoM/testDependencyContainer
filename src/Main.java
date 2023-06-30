import prePostProcessor.ComponentPostProcessor;
import prePostProcessor.ComponentPreProcessor;

public class Main {
    public static void main(String[] args) {
        DependencyContainer container = new DependencyContainer();
        ComponentPreProcessor preProcessor = new PreProcessorExample();
        ComponentPostProcessor postProcessor = new PostProcessorExample();

        container.addPreProcessor(preProcessor);
        container.addPostProcessor(postProcessor);

        SpringEmulator emulator = new SpringEmulator();
        emulator.run(container, Main.class);
    }
}