/*
    Value creates enums of each card's number value, used in Card
*/

public enum Value {

    Two("Two", 2),
    Three("Three", 3),
    Four("Four", 4),
    Five("Five", 5),
    Six("Six", 6),
    Seven("Seven", 7),
    Eight("Eight", 8),
    Nine("Nine", 9),
    Ten("Ten", 10),
    Jack("Jack", 10),
    Queen("Queen", 10),
    King("King", 10),
    Ace("Ace",11);

    public String name;
    public int cardValue;

    // assigns both a "name" and value for each use of Value
    Value(String name, int cardValue) {
        this.name = name;
        this.cardValue = cardValue;
    }

    // converting the suits to their String values
    public String toString() {
        return name;
    }
}

//    public static void main (String[] args) {
//        System.out.println(Value.Ace + " " + Value.Ace.value);
//    }