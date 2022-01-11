public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        if((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)){
            return false;
        }
        else{
            int num1LastDigit = number1 % 10;
            int num2LastDigit = number2 % 10;

            number1 /= 10;
            number2 /= 10;

            if((num1LastDigit == number2) || (num1LastDigit == num2LastDigit) || (number1 == number2) || (number1 == num2LastDigit)){
                return true;
            }
            else
                return false;
        }
    }

    public static void main(String[] args){
        System.out.println(hasSharedDigit(15,55));
    }
}
