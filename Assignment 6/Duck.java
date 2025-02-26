abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;

    public void setQuackBehaviour(QuackBehaviour behaviour) {
        this.quackBehaviour = behaviour;
    }

    public void setSwimBehaviour(SwimBehaviour behaviour) {
        this.swimBehaviour = behaviour;
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    abstract public void display();
}
