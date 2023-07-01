public class Main {
    public static void main(String[] args) {
        DependencyContainer container = new DependencyContainer();

        PreProcessSubscriber preProcessor = new PreProcessSubscriber();
        PostProcessSubscriber postProcessor = new PostProcessSubscriber();

        container.addSubscriber(preProcessor);
        container.addSubscriber(postProcessor);

        container.run(Main.class);
    }
}