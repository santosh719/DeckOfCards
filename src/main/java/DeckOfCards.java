import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 * Created by santosh on 3/23/2017.
 * Deck of Cards
       52 cards with:
           ● 4 suits: hearts​, spades​, clubs​, diamonds
           ● Face values of: Ace​, 2-10​, Jack​, Queen​, and King​).
       Within one of your classes, you must provide two operations:
           shuffle()​ - shuffle returns no value, but results in the cards in the deck being randomly permuted
           dealOneCard()​ - returns one card from the deck to the caller.
 */
public class DeckOfCards {

    /*********************** Data members ***********************/
    private List<Card> cards = new ArrayList<>();
    private int remainingCardsInDeck;

    public static final int DECK_SIZE = 52;

    /*********************** Constructors ***********************/

    /**
     * Constructs a new Deck object containing 52 cards.
     */

    public DeckOfCards(){

        this.remainingCardsInDeck = DECK_SIZE;
        for (Suits s : Suits.values()) {
            for (FaceValues v : FaceValues.values()) {
                Card c = new Card(s,v);
                this.cards.add(c);
            }
        }
    }

    /*********************** Methods ***********************/

    /**
     * Shuffles the deck (i.e. randomly reorders the cards in the deck).
     * I have implemented two methods to shuffle -
     * The simpler way would be using the built-in Collections.shuffle() method
     * Other way would be by using random number
     */
    public void shuffle(){

        /**** first way to shuffle ****/
        //Collections.shuffle(this.cards);

        /**** second way to shuffle ****/
        int newIndex;
        Card temp;
        Random randIndex = new Random();

        for (int i = 0; i < this.remainingCardsInDeck; i++) {

            // pick a random index between 0 and remainingCardsInDeck - 1
            newIndex = randIndex.nextInt(this.remainingCardsInDeck);

            // swap cards[i] and cards[newI]
            temp = this.cards.get(i);
            this.cards.add(i,this.cards.get(newIndex));
            this.cards.add(newIndex,temp);
        }
    }

    public void dealOneCard(){
        if(remainingCardsInDeck == 0){
            System.out.println("No cards left to deal");
        }
        else{
            remainingCardsInDeck--;
            System.out.println(this.cards.get(remainingCardsInDeck).toString());
        }
    }

}
