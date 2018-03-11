package tarot.model;

import java.util.ArrayList;
import java.util.List;

//A class to abstract away the details of specific spreads
public class SpreadBuilder {
    //generic constructor
    public SpreadBuilder(){}

    //set up three card spread
    public static Spread getThreeCardSpread(){
        //Initialize spread
        Spread spread = new Spread();

        //set name
        spread.setName("ThreeCardSpread");

        //initialize and set values for positions
        List<String> positionList = new ArrayList<>();
        positionList.add("Past");
        positionList.add("Present");
        positionList.add("Future");
        spread.setPositions(positionList);

        //initialize and set values for rowNumbers
        List<String> rowNumbers = new ArrayList<>();
        rowNumbers.add("none");
        rowNumbers.add("none");
        rowNumbers.add("none");
        spread.setRowNumbers(rowNumbers);

        return spread;
    }

    //set up simple cross spread
    public static Spread getSimpleCrossSpread(){
        //Initialize spread
        Spread spread = new Spread();

        // set name
        spread.setName("SimpleCrossSpread");

        //initialize and set values for positions
        List<String> positionList = new ArrayList<>();
        positionList.add("Where you will be");
        positionList.add("What comes with you");
        positionList.add("Where you are");
        positionList.add("What comes with you");
        positionList.add("Where you came from");
        spread.setPositions(positionList);

        //initialize and set values for rowNumbers
        List<String> rowNumbers = new ArrayList<>();
        rowNumbers.add("one");
        rowNumbers.add("two-left");
        rowNumbers.add("two-middle");
        rowNumbers.add("two-right");
        rowNumbers.add("three");
        spread.setRowNumbers(rowNumbers);

        return spread;
    }
}
