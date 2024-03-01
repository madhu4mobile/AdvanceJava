package practice;

public class Section4Challenge {
    public static void main(String[] args) {

        Double myDouble = 25.00d;
        Double mySecondDouble = 70.00d;
        Double myResult = myDouble + mySecondDouble * 100.00d;
        System.out.println("myResult = " + myResult);

        Double myReminder = myResult % 3;
        System.out.println("myReminder when divided by 3 = " + myReminder);

        boolean isReminder = ( myReminder != 0.00) ? false : true;
        System.out.println("isReminder = " + isReminder);
        
        if( isReminder){
            System.out.println("Reminder is zero !");
        } else {
            System.out.println("Got some reminder and it is = " + myReminder);
        }

    }
}
