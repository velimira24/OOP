public class Car implements iStart {
    private PetrolEngine engine;

    public Car(PetrolEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        this.engine.start();
    }

}