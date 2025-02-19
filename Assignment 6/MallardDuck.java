public class MallardDuck extends Duck {
    public  MallardDuck() {
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
