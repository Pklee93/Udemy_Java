public class Sum3And5Challenge {
    public static void main(String[] args){

        int sum = 0;
        int count = 0;

        for(int i=1; i<=1000;i++){
            if( ( (i%3) == 0) && ( (i%5) == 0) ){
                System.out.println(i + " can be divided with both 3 and also with 5");
                sum = sum + i;
                count++;
            }

            if(count == 5)
                break;
        }

        System.out.println("The sum of the five numbers is " + sum);
    }
}
