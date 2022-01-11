public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if((first < 10) || (second < 10)){
            return -1;
        }
        else{
            int initiation;
            int greatestDivisor = 0;

            if(first<second)
                initiation = first;
            else
                initiation = second;

            for(int i = initiation; i>0; i--){
                if(((first % i) == 0) && ((second % i) == 0)){
                    greatestDivisor = i;
                    break;
                }
            }
            return greatestDivisor;
        }
    }

    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(81,153));
    }
}
