abstract public class Duck {
    QuackBehavior quackBehavior;

    public void setQuackBehaviour(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract public void display();

    public void performQuack() {
        quackBehavior.quack();
    }
}