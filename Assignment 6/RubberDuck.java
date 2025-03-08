
class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
        setSwimBehavior(new Float());
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
