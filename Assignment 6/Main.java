
public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        System.out.println("Duck Behaviors:\n\n");
        displayDuckBehavior(mallard);
        displayDuckBehavior(redhead);
        displayDuckBehavior(rubber);
        displayDuckBehavior(decoy);
    }

    private static void displayDuckBehavior(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.performSwim();
        System.out.println();
    }
}
