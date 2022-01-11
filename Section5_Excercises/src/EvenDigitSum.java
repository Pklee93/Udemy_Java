public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        else{
            int digit;
            int sum = 0;
            while(number >= 1){
                digit = number % 10;
                number /= 10;
                if((digit % 2) == 0){
                    sum += digit;
                }
            }

            return sum;
        }
    }

    public static void main(String[] args){
        System.out.println(getEvenDigitSum(-22));
    }
}
