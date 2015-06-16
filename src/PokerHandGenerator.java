import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by robertmilcu on 02/06/15.
 */
public class PokerHandGenerator {

    private String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "king"};
    private String[] suit = {"Spade", "Clubs", "Hearts", "Diamonds"};
    private static String[] deck = new String[52]; // Generated to "" from 0 to 52

    public String[] createDeck(String[] deck) {
        int i = 0;
        for (String tempRank : rank) {
            for (String tempSuit : suit) {
                deck[i++] = tempRank + " of " + tempSuit;
            }
        }
        return deck;
    }

    public String[] randomizeDeck(String[] deck){
        for (int half = 0; half < 26; half ++){
            for (int full = 0; full < 52; full++){
                String temp = deck[half];
                deck[half] = deck[full];
                deck[full] = temp;
            }
        }
        return deck;
    }

    public String[] generateHand(int handSize, String[] hand){
        int i = 0;
        while (i < handSize){
            double randomNumber = (Math.random() * 52);
            int cardLocation = (int)(randomNumber);
            if (validCard(hand, deck[cardLocation])){
                hand[i] = deck[cardLocation];
                i++;
            }
        }
        return hand;
    }

    public boolean validCard(String[] hand, String card) {
        boolean output = true;
        for (String handCard : hand) {
            output = (card == handCard) ? false : true;
        }
        return output;
    }

     public void print(String[] hand){
         String output = "";
         for (String card : hand){
             output+= card.toString() + " , ";
         }
         System.out.println(output.substring(0, output.length() - 2));
     }

    public static void main (String[] args) {
        int handSize = 0;
        PokerHandGenerator generatorObj = new PokerHandGenerator();
        System.out.println("What size do you want your hand to be?");
        while (true){
            try {
                Scanner keyboard = new Scanner(System.in);
                handSize = keyboard.nextInt();
                break;
            } catch (InputMismatchException nfe) {
                System.out.println("Input was not a valid number");
            }
        }
        String[] hand = new String[handSize];
        deck = generatorObj.createDeck(deck);
        deck = generatorObj.randomizeDeck(deck);
        deck = generatorObj.generateHand(handSize, hand);
        generatorObj.print(hand);
    }
}
