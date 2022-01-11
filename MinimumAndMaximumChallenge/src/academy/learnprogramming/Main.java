/*
- Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered
- Before the user enters the number, print the message "Enter number:"
- If the user enters an invalid number, break out of the loop and print the minimum and maximum number
- Hint
    - Use an endless while loop
 */

package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maximum=0;
        int minimum=0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            int number;
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                number = scanner.nextInt();
                counter++;
            } else{
                break;
            }

            scanner.nextLine(); //handle input

            if(counter == 1){
                maximum = number;
                minimum = number;
            }

            if(number > maximum){
                maximum = number;
            }

            if(number < minimum){
                minimum = number;
            }

        }

        scanner.close();

        System.out.println("Maximum = " + maximum + ", Minimum = " + minimum);
    }
}
