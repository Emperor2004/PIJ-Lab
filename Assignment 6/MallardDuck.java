public class MallardDuck extends Duck {
    public MallardDuck() {
        Quack quack = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
