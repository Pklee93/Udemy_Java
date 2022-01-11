public class EqualSumChecker {
    public static boolean hasEqualSum(int value1, int value2, int value3){
        int sum = value1 + value2;

        if(sum == value3){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args){
        System.out.println(hasEqualSum(1,-1,0));
    }
}
