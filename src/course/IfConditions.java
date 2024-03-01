package course;

public class IfConditions {
    public static void main(String[] args) {
        boolean isAlien = true;
        if (isAlien) {
            System.out.println("I am not alien !");
            System.out.println("isAlien = " + isAlien);
        }

        //Checing topscore
        int topScore = 70;
        if (topScore >= 80){
            System.out.println("You got the high score " );
        }
// Logical AND
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

//Logical OR
        if ((topScore > 90) || (topScore <= 90)){
            System.out.println("Top score is either greater than 90 OR less or equal to 90");
        }



    }
}
