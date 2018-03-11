package tarot.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reading {
    //generic construction
    public Reading() {}

    //create auto reading given the spread requested
    public static List<Card> getAutoReading(Spread spread){
        Deck deck = new Deck();

        //shuffle
        deck.shuffle();

        //cut
        deck.cut();

        //initialize list of positions (what card means in given space)
        List<String> positions = spread.getPositions();

        //initialize list of row numbers (where card will be shown on screen)
        List<String> rowNumbers = spread.getRowNumbers();

        //initialize randome number generator
        Random random = new Random();

        //create list of cards to be returned
        List<Card> reading = new ArrayList<>();

        //draw a card for each position in the requested spread
        for (int i = 0; i < positions.size(); i++){
            Card c = deck.draw();

            // set position and rownumber based on the requested spread
            c.setPosition(positions.get(i));
            c.setRowNumber(rowNumbers.get(i));

            //randomly set whether or not the card is reversed
            c.setReversed(random.nextBoolean());

            reading.add(c);
        }

        return reading;
    }
}
