/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		deck1();
        deck2();
        deck3();
    }

    private static void deck1() {
        String[] r = {"thing1", "thing2", "thing3"};
        String[] s = {"test", "leedle", "lee"};
        int[] v = {1, 2, 3};

        Deck d = new Deck(r, s, v);

        System.out.println("i'm testing the first thing i guess");

        if(d.size() == 9) {
            System.out.println("hey look 9 equals 9");
        }
        else {
            System.out.println("hey " + d.size() + " didn't equal 9");
        }

        Card thing = d.deal();

        if(d.size() == 8 && thing.rank().equals("thing3") && thing.suit().equals("lee") && thing.pointValue() == 3) {
            System.out.println("hey it drew right");
        }
        else {
            System.out.println("it didn't draw right");
        }

        System.out.println("now i'm gonna keep drawing cards");

        for (int x=0;x<8;x++) {
            d.deal();
        }

        if(d.deal() == null) {
            System.out.println("we got null, that's good");
        }
        else {
            System.out.println("we didn't get null, but the app probably crashed anyways");
        }

        if(d.isEmpty()) {
            System.out.println("the deck is also empty");
        }
        else {
            System.out.println("the deck isn't empty, wth did you do");
        }

        System.out.println();
        System.out.println(d);
    }

    private static void deck2() {
        String[] r = {"thing1", "thing2", "thing3"};
        String[] s = {"test", "lee"};
        int[] v = {1, 2, 3};

        Deck d = new Deck(r, s, v);

        System.out.println("i'm testing the first thing i guess");

        if(d.size() == 6) {
            System.out.println("hey look 6 equals 6");
        }
        else {
            System.out.println("hey " + d.size() + " didn't equal 6");
        }

        Card thing = d.deal();

        if(d.size() == 5 && thing.rank().equals("thing3") && thing.suit().equals("lee") && thing.pointValue() == 3) {
            System.out.println("hey it drew right");
        }
        else {
            System.out.println("it didn't draw right");
        }

        System.out.println("now i'm gonna keep drawing cards");

        for (int x=0;x<6;x++) {
            d.deal();
        }

        if(d.deal() == null) {
            System.out.println("we got null, that's good");
        }
        else {
            System.out.println("we didn't get null, but the app probably crashed anyways");
        }

        if(d.isEmpty()) {
            System.out.println("the deck is also empty");
        }
        else {
            System.out.println("the deck isn't empty, wth did you do");
        }

        System.out.println();
        System.out.println(d);
    }

    private static void deck3() {
        String[] r = {"thing1", "thing2", "thing3"};
        String[] s = {"test", "idk", "this should work too", "cheap", "lee"};
        int[] v = {1, 2, 3};

        Deck d = new Deck(r, s, v);

        System.out.println("i'm testing the first thing i guess");

        if(d.size() == 15) {
            System.out.println("hey look 15 equals 15");
        }
        else {
            System.out.println("hey " + d.size() + " didn't equal 15");
        }

        Card thing = d.deal();

        if(d.size() == 14 && thing.rank().equals("thing3") && thing.suit().equals("lee") && thing.pointValue() == 3) {
            System.out.println("hey it drew right");
        }
        else {
            System.out.println("it didn't draw right");
        }

        System.out.println("now i'm gonna keep drawing cards");

        for (int x=0;x<14;x++) {
            d.deal();
        }

        if(d.deal() == null) {
            System.out.println("we got null, that's good");
        }
        else {
            System.out.println("we didn't get null, but the app probably crashed anyways");
        }

        if(d.isEmpty()) {
            System.out.println("the deck is also empty");
        }
        else {
            System.out.println("the deck isn't empty, wth did you do");
        }

        System.out.println();
        System.out.println(d);
    }
}