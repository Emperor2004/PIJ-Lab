# Card Deck Java Program

## 📌 Overview
This is a **menu-driven Java program** that demonstrates the concepts of **classes, ArrayLists, and instance members**. It allows users to ***create, shuffle, print, find, compare, and deal cards*** from a standard deck of 52 playing cards.

## 🚀 Features
- Create a **deck of 52 cards** (13 ranks, 4 suits)
- Print the **entire deck**
- Print a **specific card** by index
- Find all cards of the **same suit**
- Find all cards of the **same rank**
- Search for a **specific card** (rank & suit)
- Deal **5 random cards**
- Shuffle the **deck**
- **Menu-driven system** for user interaction

## 📂 Project Structure & Functionalities

### 📌 [`Card.java`](Card.java)
This class represents a **single playing card** with the following attributes:
- `rank` (e.g., Ace, 2, 3, ..., King)
- `suit` (Hearts, Diamonds, Clubs, Spades)

#### 🔹 Functionalities:
- **Constructor** to initialize a card with rank and suit.
- **`toString()`** method to display the card as `Rank of Suit`.

---

### 📌 [`Deck.java`](Deck.java)
This class **manages the deck of 52 cards** using an `ArrayList<Card>`. It handles all operations on the deck.

#### 🔹 Functionalities:
- **`createDeck()`**: Creates a standard 52-card deck.
- **`printDeck()`**: Displays all the cards in the deck.
- **`printCard(int index)`**: Prints a specific card from the deck.
- **`sameCard(String suit)`**: Prints all cards of a specific suit.
- **`compareCard(String rank)`**: Prints all cards of a specific rank.
- **`findCard(String rank, String suit)`**: Searches for a specific card in the deck.
- **`dealCard()`**: Deals 5 random cards.
- **`shuffleDeck()`**: Shuffles the deck to randomize card order.

---

### 📌 [`Main.java`](Main.java)
This is the **entry point** of the program, responsible for **user interaction** through a menu-driven system.

#### 🔹 Functionalities:
- Presents a **menu** with options for all deck operations.
- Takes **user input** and calls the appropriate functions from `Deck`.

---
