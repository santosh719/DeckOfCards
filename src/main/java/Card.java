/**
 * Created by santosh on 3/23/2017.
 * Card class which represents a single card
 */
public class Card {
    private Suits suit;
    private FaceValues faceValues;

    public Card(Suits suit, FaceValues faceValues) {
        this.suit = suit;
        this.faceValues = faceValues;
    }

    //getter methods
    public Suits getSuit() {
        return suit;
    }

    public FaceValues getFaceValue() {
        return faceValues;
    }

    //converting the given card into string
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return suit+"-"+faceValues;
    }
}
