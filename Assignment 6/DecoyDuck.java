// Class for Decoy Duck

class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
        setSwimBehavior(new Drown());
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck");
    }
}
