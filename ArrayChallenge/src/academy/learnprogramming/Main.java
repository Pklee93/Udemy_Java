package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = getIntegers(5);
        sortIntegers(array1);
        printArray(array1);
    }

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        for(int i=0; i<size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int store;
        boolean flag = true;

        while(flag){
            flag = false;
            for(int i=0; i<unsortedArray.length - 1; i++) {
                if(unsortedArray[i] < unsortedArray[i+1]) {
                    store = unsortedArray[i+1];
                    unsortedArray[i+1] = unsortedArray[i];
                    unsortedArray[i] = store;
                    flag = true;
                }
            }
        }

        return unsortedArray;
    }

    public static void printArray(int[] array) {
        for(int i= 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
