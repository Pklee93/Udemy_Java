//Palindrome: A word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar.

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }

        int reverseNumber = 0;
        int stored = number;

        while(stored >= 1){
            int lastDigit = stored % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            stored /= 10;
        }

        if(reverseNumber == number){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(-1221));
    }
}
