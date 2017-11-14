package tarot.model;

import java.util.ArrayList;

public class DeckBuilder {

    public DeckBuilder() {
    }

    public static ArrayList<Card> getMajorDeck(){
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Card(0,"The Fool", Arcana.MAJOR, null, true));
        deck.add(new Card(1,"The Magician", Arcana.MAJOR, null, true));
        deck.add(new Card(2,"The High Priestess", Arcana.MAJOR, null, true));
        deck.add(new Card(3,"The Empress", Arcana.MAJOR, null, true));
        deck.add(new Card(4,"The Emperor", Arcana.MAJOR, null, true));
        deck.add(new Card(5,"The Hierophant", Arcana.MAJOR, null, true));
        deck.add(new Card(6,"The Lovers", Arcana.MAJOR, null, true));
        deck.add(new Card(7,"The Chariot", Arcana.MAJOR, null, true));
        deck.add(new Card(8,"Strength", Arcana.MAJOR, null, true));
        deck.add(new Card(9,"The Hermit", Arcana.MAJOR, null, true));
        deck.add(new Card(10,"Wheel of Fortune", Arcana.MAJOR, null, true));
        deck.add(new Card(11,"Justice", Arcana.MAJOR, null, true));
        deck.add(new Card(12,"The Hanged Man", Arcana.MAJOR, null, true));
        deck.add(new Card(13,"Death", Arcana.MAJOR, null, true));
        deck.add(new Card(14,"Temperance", Arcana.MAJOR, null, true));
        deck.add(new Card(15,"The Devil", Arcana.MAJOR, null, true));
        deck.add(new Card(16,"The Tower", Arcana.MAJOR, null, true));
        deck.add(new Card(17,"The Star", Arcana.MAJOR, null, true));
        deck.add(new Card(18,"The Moon", Arcana.MAJOR, null, true));
        deck.add(new Card(19,"The Sun", Arcana.MAJOR, null, true));
        deck.add(new Card(20,"Judgement", Arcana.MAJOR, null, true));
        deck.add(new Card(21,"The World", Arcana.MAJOR, null, true));
        return deck;
    }

    public static ArrayList<Card> getMinorDeck() {
        ArrayList deck = new ArrayList<Card>();
        int id = 22;
        for ( Suit s: Suit.values()) {
            for (Rank r: Rank.values()) {
                String name = r.getName() + " of " + s.getName();
                deck.add(new Card(id, name, Arcana.MINOR, null, true));
                id++;
            }
        }
        return deck;
    }
}
