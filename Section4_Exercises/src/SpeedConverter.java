public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour){
        long value = Math.round(kilometersPerHour / 1.609);

        if(kilometersPerHour < 0){
            return -1;
        }
        else {
            return value;
        }

    }

    public static void printConversion (double kilometersPerHour){
        long value = Math.round(kilometersPerHour / 1.609);

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + value + " mi/h");
        }

    }

    public static void main(String[] args){
        printConversion(1.5);
    }
}


