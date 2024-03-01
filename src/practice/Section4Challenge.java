package practice;

public class Section4Challenge {
    public static void main(String[] args) {

        Double myDouble = 20.00;
        Double mySecondDouble = 80.00;
        Double myResult = (myDouble + mySecondDouble) * 100;

        Double myReminder = myResult % 40.00;

        boolean isReminder = ( myReminder != 0.00) ? (false) : (true);
        System.out.println("isReminder = " + isReminder);
        
        if( isReminder){
            System.out.println("Reminder is zero ! ");
        } else {
            System.out.println("got some reminder and it is = " + myReminder);
        }

    }
}
