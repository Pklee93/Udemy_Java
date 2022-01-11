public class TeenNumberChecker {
    public static boolean hasTeen(int value1, int value2, int value3){
        if(isTeen(value1) || isTeen(value2) || isTeen(value3)){
            return true;
        }
        else
            return false;
    }

    public static boolean isTeen(int value){
        if((value >= 13) && (value <= 19)){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args){
        System.out.println(hasTeen(22,23,34));
    }
}
