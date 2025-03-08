abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        swimBehavior.swim();
    }
    
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
    
    public void setSwimBehavior(SwimBehavior sb) {
        this.swimBehavior = sb;
    }
    
    public abstract void display();
}