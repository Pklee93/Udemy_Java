public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount < 0) || (smallCount < 0) || (goal < 0))
            return false;

        int bigBagNeeded = 0;
        int smallBagNeeded = 0;

        while(goal > 0){
            if(goal >= 5){
                goal -= 5;
                bigBagNeeded++;
            }
            else{
                goal--;
                smallBagNeeded++;
            }
        }

        while((bigCount > 0) || (bigBagNeeded > 0)){
            if((bigCount == 0) || (bigBagNeeded == 0))
                break;
            bigBagNeeded--;
            bigCount--;
        }

        while((smallBagNeeded > 0) || (smallCount > 0)){
            if((smallBagNeeded == 0) || (smallCount == 0))
                break;
            if(bigBagNeeded > 0){
                bigBagNeeded--;
                smallCount -= 5;
            }
            else{
                smallBagNeeded--;
                smallCount--;
            }
        }

        if(smallBagNeeded > 0){
            return false;
        }
        else return true;
    }

    public static void main(String[] args){
        System.out.println(canPack(0,5,6));
    }
}
