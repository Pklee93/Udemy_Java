package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}

/*
Integer.parseInt(String s)
- This method change string to int
- Ex) "2018" -> 2018

Double.parseDouble(String s)
- The method change string to double
- Ex) "2018.125" -> 2018.125
 */
