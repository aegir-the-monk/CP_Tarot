package tarot.model;

public enum Suit {
        CUPS ("Cups", 22),
        SWORDS ("Swords", 36),
        WANDS ("Wands", 50),
        PENTACLES ("Pentacles", 64);

        private final String name;
        private final int imageID;

        Suit(String name, int imageID){
            this.name = name;
            this.imageID = imageID;
        }

    public String getName() {
        return name;
    }
    public int getImageID() { return imageID;}
}