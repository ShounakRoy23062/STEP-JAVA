import java.util.Scanner;
import java.util.Random;
public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();
        System.out.print("Enter cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        dealCards(deck, players, cardsPerPlayer);
    }
    
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                         "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }
    
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = rand.nextInt(deck.length);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
    
    public static void dealCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards in the deck!");
            return;
        }
        
        for (int p = 0; p < players; p++) {
            System.out.println("\nPlayer " + (p+1) + " cards:");
            for (int c = 0; c < cardsPerPlayer; c++) {
                System.out.println(deck[p * cardsPerPlayer + c]);
            }
        }
    }
}

