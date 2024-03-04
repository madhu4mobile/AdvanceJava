package course.section4;

public class GradesByTernaryOperator {
    public static void main(String[] args) {
        System.out.println("Starting GradesByTernaryOperator!");
        System.out.println(getGrade(98));
        System.out.println(getGrade(87));
        System.out.println(getGrade(72));
        System.out.println(getGrade(65));
        System.out.println(getGrade(35));

    }
    public static String getGrade(int score){

        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" :  "F";
        String result =  String.format( "The student with score %d is with grade %s ", score, grade);

        return result;
    }
}
