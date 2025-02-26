public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

    @Override
    public void performQuack() {
        System.out.println("I'm a rubber duck");
    }

    @Override
    public void performSwim() {
        System.out.println("I'm a rubber duck");
    }

}
