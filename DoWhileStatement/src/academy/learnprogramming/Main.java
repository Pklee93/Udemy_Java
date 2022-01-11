package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6){
            System.out.println("count value is " + count);
            count++;
        }
        System.out.println("-------------------------------------");

        for(count = 1; count <6; count++){
            System.out.println("count value is " + count);
        }

        System.out.println("-------------------------------------");

        count = 1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("count value is " + count);
            count++;
        }

        System.out.println("-------------------------------------");

        count = 1;
        do{
            System.out.println("count value is " + count);
            count++;

            if(count > 100){
                break;
            }
        } while(count != 6);

        System.out.println("-------------------------------------");

        /*
        Challenge
        - Create a method called isEvenNumber that takes a parameter of type int
        - Its purpose is to determine if the argument passed to the method is an even number or not.
        - Return true if an even number, otherwise return false
         */

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
        }

        System.out.println("-------------------------------------");

        /*
        Challenge
        - Modify the while code above
        - Make it also record the total number of even numbers it has found and break once 5 are found
        - and at the end, display the total number of even numbers found
         */

        number = 4;
        finishNumber = 20;
        count = 0;

        do{
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
            count++;
        }while(count != 5);

        System.out.println("Total even numbers found is " + count);
    }

    public static boolean isEvenNumber(int number){
        if( (number % 2) == 0){
            return true;
        }
        else
            return (number % 2) == 0;
    }
}

/*
- With the continue keyword, the loop will bypass the part of code block that is below the continue keyword and continue with the next iteration
- With the break keyword, we can exit the loop depending on the condition that we are checking.
 */
