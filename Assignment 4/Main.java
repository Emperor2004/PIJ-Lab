
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;

        do {

            System.out.println("\nMENU");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Specific Card");
            System.out.println("3. Find Cards of Same Suit");
            System.out.println("4. Find Cards of Same Rank");
            System.out.println("5. Find a Specific Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    deck.printDeck();
                    break;
                case 2:

                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:

                    System.out.print("Enter suit: ");
                    String suit = scanner.nextLine();
                    deck.sameCard(suit);
                    break;
                case 4:

                    System.out.print("Enter rank: ");
                    String rank = scanner.nextLine();
                    deck.compareCard(rank);
                    break;
                case 5:

                    System.out.print("Enter rank: ");
                    rank = scanner.nextLine();
                    System.out.print("Enter suit: ");
                    suit = scanner.nextLine();
                    deck.findCard(rank, suit);
                    break;
                case 6:

                    deck.dealCard();
                    break;
                case 7:

                    deck.shuffleDeck();
                    break;
                case 8:

                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 8);
    }
}
