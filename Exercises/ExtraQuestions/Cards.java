package Exercises.ExtraQuestions;

public class Cards {
    private String Clubs;
    private String Hearts;
    private String Spades;
    private String Diamonds;

    public Cards(String a, String b, String c, String d) {
        this.Clubs = a;
        this.Hearts = b;
        this.Spades = c;
        this.Diamonds = d;

    }

    public String getClubs() {
        return this.Clubs;
    }

    public String getHearts() {
        return this.Hearts;
    }

    public String getSpades() {
        return this.Spades;
    }

    public String getDiamonds() {
        return this.Diamonds;
    }

    @Override
    public String toString() {
        return "(" + this.getClubs() + " Clubs, " + this.getHearts() + " Hearts, " + this.getSpades() + " Spades, " + this.getDiamonds() + " Diamonds)";
    }

    public static void main(String[] args) {
        Cards H = new Cards("10", "King", "Ace", "2");
        System.out.println(H.toString());
    }
}
