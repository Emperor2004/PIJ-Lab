import java.util.*;

// Manages the deck of 52 cards and provides various operations
class Deck {
    ArrayList<Card> deck;

    // Constructor initializes the deck and creates all 52 cards
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Creates a standard deck of 52 playing cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Prints all the cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Prints a specific card from the deck based on its index
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid card index!");
        }
    }

    // Prints all cards of the specified suit
    public void sameCard(String suit) {
        for (Card card : deck) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    // Prints all cards with the specified rank
    public void compareCard(String rank) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    // Searches for a specific card in the deck
    public boolean findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card Found: " + card);
                return true;
            }
        }
        System.out.println("Card not found.");
        return false;
    }

    // Deals (prints) five random cards from the deck
    public void dealCard() {
        shuffleDeck();
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    // Shuffles the deck to randomize card order
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled!");
    }
}