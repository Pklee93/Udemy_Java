/*
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
For example, number 6. Its proper divisors are 1, 2, and 3 (6 is excluded because it is itself)
1 + 2 + 3 = 6, so 6 is a perfect number.
 */

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        else{
            int sum = 0;
            for(int i=1; i<number; i++){
                if((number%i) == 0){
                    sum += i;
                }
            }
            if(sum == number)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args){
        System.out.println(isPerfectNumber(-1));
    }
}
