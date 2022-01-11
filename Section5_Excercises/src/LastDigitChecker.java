public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if(isValid(number1) && isValid(number2) && isValid(number3)){
            int num1LastDigit = number1 % 10;
            int num2LastDigit = number2 % 10;
            int num3LastDigit = number3 % 10;

            if((num1LastDigit == num2LastDigit) || (num2LastDigit == num3LastDigit) || (num1LastDigit == num3LastDigit)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
           return false;
        }
    }

    public static boolean isValid(int value){
        if((value < 10) ||(value > 1000)){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args){
        System.out.println(hasSameLastDigit(9,99,999));
    }
}
