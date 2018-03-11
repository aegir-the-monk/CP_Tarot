package tarot.model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class Deck {
    //list of cards in deck
    private List<Card> cards = new ArrayList<>();

    //Deck constructed using Deckbuilder
    public Deck() {
        for ( Card c : DeckBuilder.getMajorDeck() ){
            cards.add(c);
        }
        for ( Card c : DeckBuilder.getMinorDeck()) {
            cards.add(c);
        }
    }

    //get a list of cards by suit
    public List<Card> getBySuit(Suit suit) {
        List<Card> suitList = new ArrayList<>();
        for (Card c: cards) {
            if(c.getSuit() == suit){
                suitList.add(c);
            }
        }
        return suitList;
    }

    //shuffle the cards in the deck
    public void shuffle(){
        Collections.shuffle(cards);
    }

    //cut deck in half
    public void cut(){
        Collections.rotate(cards, 39);
    }

    //draw the first card in the deck and then remove it so the same card can't be drawn twice
    public Card draw(){
        Card card = cards.get(0);
        cards.remove(0);

        return card;
    }

    //find card by the integer id
    public Card findById(int id){
        if(id < 0 || id > 77){
            return null;
        }
        for(Card c : cards){
            if(id == c.getId()){
                return c;
            }
        }
        return null;
    }
}
