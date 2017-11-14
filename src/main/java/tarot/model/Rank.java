package tarot.model;

public enum Rank {
    ACE ("Ace"),
    TWO ("Two"),
    THREE ("Three"),
    FOUR ("Four"),
    FIVE ("Five"),
    SIX ("Six"),
    SEVEN ("Seven"),
    EIGHT ("Eight"),
    NINE ("Nine"),
    TEN ("Ten"),
    PAGE ("Page"),
    KNIGHT ("Knight"),
    QUEEN ("Queen"),
    KING ("King");

    private final String name;

    Rank(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
