package tarot.model;

import java.util.ArrayList;

public class Deck {
    private boolean shuffled;
    private ArrayList<Card> cards;

    public Deck() {
        this.shuffled = false;
        this.cards = new ArrayList<Card>();
        for ( Card c : DeckBuilder.getMajorDeck() ){
            cards.add(c);
        }
        for ( Card c : DeckBuilder.getMinorDeck()) {
            cards.add(c);
        }
    }

    public boolean isShuffled() {
        return shuffled;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setShuffled(boolean shuffled) {
        this.shuffled = shuffled;
    }
}
