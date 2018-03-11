package tarot.model;

import java.util.ArrayList;

// class used to abstract away the addition of specific cards to a deck
public class DeckBuilder {

    public DeckBuilder() {
    }
    //each card of the Major arcana must be added individually
    public static ArrayList<Card> getMajorDeck(){
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Card(0,"The Fool", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(1,"The Magician", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(2,"The High Priestess", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(3,"The Empress", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(4,"The Emperor", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(5,"The Hierophant", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(6,"The Lovers", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(7,"The Chariot", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(8,"Strength", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(9,"The Hermit", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(10,"Wheel of Fortune", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(11,"Justice", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(12,"The Hanged Man", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(13,"Death", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(14,"Temperance", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(15,"The Devil", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(16,"The Tower", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(17,"The Star", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(18,"The Moon", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(19,"The Sun", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(20,"Judgement", Arcana.MAJOR, null, false, null, null));
        deck.add(new Card(21,"The World", Arcana.MAJOR, null, false, null, null));
        return deck;
    }

    //add minor arcana cards by looping through all the ranks in each suit
    public static ArrayList<Card> getMinorDeck() {
        ArrayList deck = new ArrayList<Card>();
        // initialize id to 22 since 21 is the last card of the major arcana
        int id = 22;

        for ( Suit s: Suit.values()) {
            for (Rank r: Rank.values()) {
                String name = r.getName() + " of " + s.getName();
                deck.add(new Card(id, name, Arcana.MINOR, s, false, null, null));
                id++;
            }
        }
        return deck;
    }
}
