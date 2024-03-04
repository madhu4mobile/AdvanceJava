package course.section5;

public class IfElseIfChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.printf( "Your final score after completing the level %d was : %d",levelCompleted,finalScore);
        }
//Challenge
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.printf("\nYour final score after completing the level %d was : %d",levelCompleted,finalScore);
        }

    }
}
