public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfTheDay){
        boolean result;

        if(barking == false){
            result = false;
        }
        else{
            if((hourOfTheDay < 0) || (hourOfTheDay > 23)){
                result = false;
            }
            else{
                if((hourOfTheDay < 8) || (hourOfTheDay > 22)){
                    result = true;
                }
                else{
                    result = false;
                }
            }
        }


        return result;
    }

    public static void main(String[] args){
        System.out.println(shouldWakeUp(true, -1));
    }
}
