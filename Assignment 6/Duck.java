// Abstract Duck class

abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    // Perform fly action
    public void performFly() {
        flyBehavior.fly();
    }

    // Perform quack action
    public void performQuack() {
        quackBehavior.quack();
    }

    // Perform swim action
    public void performSwim() {
        swimBehavior.swim();
    }

    // Set the fly behavior dynamically
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    // Set the quack behavior dynamically
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    // Set the swim behavior dynamically
    public void setSwimBehavior(SwimBehavior sb) {
        this.swimBehavior = sb;
    }

    // Abstract method
    public abstract void display();
}