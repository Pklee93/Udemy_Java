public class Challenge {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeter;

        if((feet < 0) || ((inches < 0) || (inches > 12))){
            return -1;
        }
        else {
            centimeter = (inches * 2.54) + (feet * 12 * 2.54);
            return centimeter;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double centimeter;

        if(inches < 0){
            return -1;
        }
        else{
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            centimeter = calcFeetAndInchesToCentimeters(feet,remainingInches);
            return centimeter;
        }

    }

    public static void main(String[] args){
        System.out.println(calcFeetAndInchesToCentimeters(157));
    }
}
