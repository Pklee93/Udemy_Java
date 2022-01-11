import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int SUM = 0;
        long AVG = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isAnInt = scanner.hasNextInt();

        if(isAnInt){
            while(true){
                isAnInt = scanner.hasNextInt();

                if(isAnInt){
                    int number = scanner.nextInt();
                    counter++;
                    SUM += number;
                }
                else
                    break;

                scanner.nextLine();
            }

            AVG = Math.round((double) SUM / counter);

            System.out.println("SUM = " + SUM + " AVG = " + AVG);
        }else{
            System.out.println("SUM = " + SUM + " AVG = " + AVG);
        }
    }
}
