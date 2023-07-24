/*Operator Challenge, Step 1 create a double variable with a value of 20.00.
step 2 create a second variable of type double with the value 80.00.
step 3 add both numbers together and multiply by 100.00.
step 4 use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00.
step 5 create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if it's not zero.
step 6 output the boolean variable.
step 7 write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
 */

public class Main {
    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double totalValue = (firstValue + secondValue) * 100.00d;
        System.out.println("Total Value = " + totalValue);

        double remainderValue = totalValue % 40.00d;
        System.out.println("Remainder Value = " + remainderValue);

        boolean isRemainder = (remainderValue == 0) ? true : false;
            System.out.println("There is no remainder");

        if (!isRemainder) {
            System.out.println("Got some remainder");
        }
    }
}