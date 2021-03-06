package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;    // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result *= 10;   // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3;    // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        result -= 2;    // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {   // == checks if 'isAlien' is equal or identical to 'false'
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;  //Ternary Operator ?:
        /*
        int ageOfClient = 20;
        boolean is EighteenOrOver = (ageOfClient == 20) ? true : false;

        operand one - ageOfClient == 20 in this case is the condition we are checking. It needs to return ture or false
        Operand Two - true here is the value to assign the variable isEighteenOrOver if the condition above is true
        Operand Three - false here is the value to assign to the variable isEighteenOrOver if the condition above was false
         */
        if(wasCar){
            System.out.println("wasCar is true");
        }

        double myFirstDoubleValue = 20.00;
        double mySecondDoubleValue = 80.00;
        double stepThree = (myFirstDoubleValue + mySecondDoubleValue) * 100.00;
        System.out.println("Total Value = " + stepThree);
        double remainderValue = stepThree % 40.00;
        System.out.println("Remainder = " + remainderValue);
        boolean stepFive = (remainderValue == 0) ? true : false;
        if (!stepFive){
            System.out.println("Got some remainder");
        }
        else
            System.out.println("Remainder is 0");

        int testNumber = 100;
        boolean test = (testNumber == 100) ? true : false;
        System.out.println(test);

    }
}
