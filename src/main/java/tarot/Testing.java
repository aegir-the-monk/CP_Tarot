package tarot;

import tarot.model.Card;
import tarot.model.Deck;

import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Card> cards = deck.getCards();
        for(Card c : cards){
            System.out.println(c.toString());
        }
    }
}
