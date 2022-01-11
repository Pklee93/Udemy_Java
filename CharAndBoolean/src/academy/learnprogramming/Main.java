package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';  //A char occupies two bytes of memory, or 16 bits
        char myUnicodeChar = '\u0044';  //unicode-table.com
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
