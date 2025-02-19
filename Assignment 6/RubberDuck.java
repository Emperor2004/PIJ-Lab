public class RubberDuck extends Duck{
    public  RubberDuck() {
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
