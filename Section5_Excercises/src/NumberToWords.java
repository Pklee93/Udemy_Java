public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0)
            System.out.println("Invalid Value");
        else{
            int reverse = reverse(number);
            for(int i = getDigitCount(number); i>0; i--){
                int lastDigit = reverse % 10;
                reverse /= 10;

                switch(lastDigit){
                    case 0:
                        System.out.print("Zero ");
                        break;

                    case 1:
                        System.out.print("One ");
                        break;

                    case 2:
                        System.out.print("Two ");
                        break;

                    case 3:
                        System.out.print("Three ");
                        break;

                    case 4:
                        System.out.print("Four ");
                        break;

                    case 5:
                        System.out.print("Five ");
                        break;

                    case 6:
                        System.out.print("Six ");
                        break;

                    case 7:
                        System.out.print("Seven ");
                        break;

                    case 8:
                        System.out.print("Eight ");
                        break;

                    case 9:
                        System.out.print("Nine ");
                        break;
                }
            }
        }
    }

    public static int reverse(int number){
        int store = number;
        if(number<0)
            store *= -1;

        int reverseNumber=0;

        for(int i=getDigitCount(store); i>0; i--){
            reverseNumber *= 10;
            reverseNumber += (store%10);
            store /= 10;
        }

        if(number<0)
            return (reverseNumber * -1);
        else
            return reverseNumber;
    }

    public static int getDigitCount(int number){
        if(number<0)
            return -1;
        else if(number==0)
            return 1;
        else{
            int count = 0;
            while(number >= 1){
                number /= 10;
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args){
        numberToWords(-12);
    }
}