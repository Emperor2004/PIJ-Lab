/*
Name: Om Narayan Pandit
PRN: 23070126083
Batch: AIML B1
*/

// Main class to demonstrate Duck behavior
public class Main {
    public static void main(String[] args) {
        // Creating different types of ducks
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

    // Method to display behavior of a given duck
    private static void displayDuckBehavior(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.performSwim();
        System.out.println();
    }
}