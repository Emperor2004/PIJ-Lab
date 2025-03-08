// Class for Redhead Duck

class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
        setSwimBehavior(new Swim());
    }

    @Override
    public void display() {
        System.out.println("I am Redhead Duck");
    }
}
