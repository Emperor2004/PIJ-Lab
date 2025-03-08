// Class for Mallard Duck

class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
        setSwimBehavior(new Swim());
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
