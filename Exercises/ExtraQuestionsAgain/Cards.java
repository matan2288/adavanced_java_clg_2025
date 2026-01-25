package Exercises.ExtraQuestionsAgain;

// 6. הגדירו מחלקה בשם Cards שתכיל ארבעה שדות פרטיים מטיפוס String בשם
// Clubs,Hearts, Spades, Dimonds
// הגדירו בנאי שמקבל ארבעה פרמטרים ומאתחל את ארבעת השדות הללו. למשל בעקבות הקריאה לבנאי:

// Cards H = new Cards("10", King", "Ace", "2");
// הערכים הללו יוצבו בשדות בהתאמה.
// כתבו ארבע שיטות get לכל אחד מהשדות וכתבו גירסה שתדרוס את toString ותציג את היד באופן הבא:
// (10 clubs, King Hearts, Ace Spades, 2 Dimonds)

public class Cards {
    private String Clubs, Hearts, Spades, Diamonds;

    public Cards(String c, String h, String s, String d) {
        this.Clubs = c + " Clubs";
        this.Hearts = h + " Hearts";
        this.Spades = s + " Spades";
        this.Diamonds = d + " Diamonds";
    }

    public String getC() {
        return this.Clubs;
    }
    public String getH() {
        return this.Hearts;
    }
    public String getS() {
        return this.Spades;
    }
    public String getD() {
        return this.Diamonds;
    }

    @Override
    public String toString() {
        return getC() + ", " + this.getH() + ", " + getS() + ", " + getD();
    }

    static void main() {
        Cards cards = new Cards("10", "11", "12", "13");
        System.out.println(cards.toString());
    }

}
