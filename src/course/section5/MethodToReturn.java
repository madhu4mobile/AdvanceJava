package course.section5;

public class MethodToReturn {
        /*
        To return something, the following is the structure.
        structure ....
        public static dataType methodName(p1type p1, p2type p2, {more}){
            //Method statements;
        return value;
        }
        */
        /*
        Challenge in Java:
            In most of the lang's, methods can be defined with default values, and you can omit passing values for these when calling the method.
            But Java doesn't support default values.
        */
    public static void main(String[] args) {
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(true,800,levelCompleted,bonus);
        System.out.printf("\nYour final score after completing the level %d was : %d", levelCompleted, highScore);
//Challenge

        System.out.printf("\nYour final score after completing the level %d was : %d", levelCompleted,
            calculateScore(true,10000,8,200));
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
}
