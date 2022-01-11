public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        if((int)value1 == (int)value2){
            if((int)(value1 * 1000) == (int)(value2 * 1000)){
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

    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));

    }
}
