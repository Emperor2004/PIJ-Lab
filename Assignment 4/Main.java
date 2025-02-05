class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("------------Creating Deck---------------");
        deck.createDeck();
        System.out.println("------------Deck Created---------------");
        System.out.println("------------Printing Deck---------------");
        deck.displayDeck();
        System.out.println("------------Shuffled Deck---------------");
        deck.shuffleDeck();
        deck.displayDeck();
    }
}