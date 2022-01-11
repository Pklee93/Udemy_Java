public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number < 0)
            return -1;

        int largestPrime = 0;

        for(int i = number; i > 0; i--){
            if((number % i) == 0){
                int count = 0;
                for(int j = i; j > 0; j--){
                    if((i % j) == 0)
                        count++;
                }
                if(count == 2)
                    largestPrime = i;
            }
            if(largestPrime > 0)
                break;
        }

        if(largestPrime == 0)
            return -1;
        else
            return largestPrime;
    }

    public static void main(String[] args){
        System.out.println(getLargestPrime(-1));
    }
}
