
import java.util.*;

class Deck {
    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
    }

    public void createDeck() {
        String[] ranks ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
        String[] suits ={"Hearts", "Clubs", "Diamonds", "Spades"};

        for(String rank : ranks) {
            for(String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void displayDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    // Select two random cards from the deck
    public void randomCard() {
        System.out.println(deck.get(1));
        System.out.println(deck.get(2));
    }

    // Create 3 players and distribute 5 cards at random to player and display cards of all players
    public void cardPlayers() {

    }
}