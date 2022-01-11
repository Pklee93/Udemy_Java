package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("A", calculateHighScorePosition(1500));
        displayHighScorePosition("B", calculateHighScorePosition(900));
        displayHighScorePosition("C", calculateHighScorePosition(400));
        displayHighScorePosition("D", calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition(String playerName, int scorePosition){
        System.out.println(playerName + " managed to get into position " + scorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int scorePosition;

        if(playerScore >= 1000){
            scorePosition = 1;
        }
        else if(playerScore > 500 && playerScore < 1000){
            scorePosition = 2;
        }
        else if(playerScore > 100 && playerScore < 500){
            scorePosition = 3;
        }
        else{
            scorePosition = 4;
        }

        return scorePosition;

    }
}

