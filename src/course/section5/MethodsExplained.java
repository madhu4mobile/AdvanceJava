package course.section5;

public class MethodsExplained {

    /*
    Method : A method decalres executable code that can be invocked, passing a fixed number of values as arguments

    Benefits:
        A method is a way to reduce code duplication.
        A method can be executed many times with potentially different results, by passing different data to the method
          in the form of arguments each time.
      Where :
        A method better to exist out side of Main so that you can call it later.
            
    */
    public static void main(String[] args) {
        int levelCompleted = 5;
        int bonus = 100;
        /*
        boolean gameOver = true;
        int score = 800;
        int finalScore = score;
        */
        calculateScore(true,800,levelCompleted,bonus);
//Challenge
        /*
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score;
        */
        calculateScore(true,10000,8,200);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score;
            finalScore += (levelCompleted * bonus);
            System.out.printf("\nYour final score after completing the level %d was : %d", levelCompleted, finalScore);
        }
    }
}