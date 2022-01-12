package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        return integer;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for(int i=0; i<count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for(int i=1; i<array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
