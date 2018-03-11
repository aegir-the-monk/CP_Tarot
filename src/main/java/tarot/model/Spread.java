package tarot.model;

import java.util.List;

// A spread is an arrangement of tarot cards for a reading
public class Spread {
    private String name;
    private List<String> positions;
    private List<String> rowNumbers;

    //generic constructor
    public Spread() {};

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }

    public List<String> getRowNumbers() { return rowNumbers; }

    public void setRowNumbers(List<String> rowNumbers) { this.rowNumbers = rowNumbers; }
}
