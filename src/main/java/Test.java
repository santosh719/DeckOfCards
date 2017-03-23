/**
 * Created by santosh on 3/23/2017.
 * Testing class which contains main method
 * Different test cases -
 * 1) Shuffling the original deck and printing all cards
 * 2) Shuffling the original deck and dealing the 53 cards
 * 3)Shuffling the original deck and dealing one card
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("----------------------------  Take a new deck -----------------------------------------------\n");

        DeckOfCards deck=new DeckOfCards();

        System.out.println("----------------------------  Shuffling the cards -----------------------------------------------\n");

        deck.shuffle();

        System.out.println("----------------------------  After shuffle, the deck looks like this -----------------------------------------------\n");

        for(int i = 0; i < DeckOfCards.DECK_SIZE; i++){
            deck.dealOneCard();
        }



        System.out.println("----------------------------  Take a new deck -----------------------------------------------\n");

        deck = new DeckOfCards();

        System.out.println("----------------------------  Shuffling  again  -----------------------------------------------\n");

        deck.shuffle();

        System.out.println("----------------------------  Dealing 52 cards  -----------------------------------------------\n");

        for(int i = 0; i < DeckOfCards.DECK_SIZE; i++){
            deck.dealOneCard();
        }

        System.out.println("----------------------------  Dealing 53rd card  -----------------------------------------------\n");

        deck.dealOneCard();




        System.out.println("----------------------------  Take a new deck -----------------------------------------------\n");

        deck = new DeckOfCards();

        System.out.println("----------------------------  Deal 1 card  -----------------------------------------------\n");

        deck.shuffle();

        deck.dealOneCard();

        System.out.println("----------------------------  All test cases passed  -----------------------------------------------\n");
    }
}
