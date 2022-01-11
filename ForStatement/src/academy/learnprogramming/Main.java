package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " +  calculateInterest(10000.0, 2.0));

        for(int i=2; i<9; i++){
            System.out.println("10,000 at " + i + "% interest = " +  String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("***********************************************");

        for(int i=8; i>1; i--){
            System.out.println("10,000 at " + i + "% interest = " +  String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("***********************************************");

        int count = 0;
        for(int i=5; i<100; i++){
            if(count == 3){
                break;
            }
            if(isPrime(i)){
                System.out.println(i + " is a prime number");
                count++;
            }
        }
    }

    /*
    Challenge
    - Create a for statement using any range of numbers
    - Determine if the number is a prime number using the isPrime method
    - If it is a prime number, print it out AND increment a count of the number of prime numbers found
    - if that count is 3 exit the for loop
    - Hint: Use the break; statement to exit
     */



    public static boolean isPrime(int n){

        if(n ==1) {
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if( (n % i) == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate / 100));
    }
}
