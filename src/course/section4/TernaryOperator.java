package course.section4;

public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary operator is officially called as Conditional operator
        //syntax operand1 ? operand2 : operand3
        // tests if operand1 is true then return operand2 other wise returns operand 3
        

        String countryOfBirth = "USA+";
        String isIndian = countryOfBirth == "India" ? "Indian" : "NotIndian";
/*        if(countryOfBirth == "India"){
            System.out.println("He is  " + isIndian);
        }*/
        System.out.println("The candidate is " + isIndian);

        //ex:2
        String vehicleMake = "BMW";
        boolean isLocal = vehicleMake == "BMW" ? true : false;
        isLocal = vehicleMake == "VoksWagon" ? false : true;
        if(isLocal){
            System.out.println("The car "+vehicleMake+" is made in USA");
        } else {
            System.out.println("The car "+vehicleMake+" is not made in USA");
        }
    }
}
