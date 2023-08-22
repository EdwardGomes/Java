/*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean, and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.*/
public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Int = (int) (num1 * 1000);
        int num2Int = (int) (num2 * 1000);
        return num1Int == num2Int;
    }
}
