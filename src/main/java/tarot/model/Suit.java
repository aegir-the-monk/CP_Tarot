package tarot.model;

public enum Suit {
        CUPS ("Cups"),
        SWORDS ("Swords"),
        WANDS ("Wands"),
        PENTACLES ("Pentacles");

        private final String name;

        Suit(String name){
            this.name = name;
        }

    public String getName() {
        return name;
    }
}