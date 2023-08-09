public class Main {

    public static void main(String[] args) {
        System.out.println("5 foot, 8 inches = " + convertToCentimeters(5, 8) + " centimeters");
        System.out.println("68 inches = " + convertToCentimeters(68) + " centimeters");
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
      //  return convertToCentimeters((feet * 12) + inches);

      int feetToInches = feet * 12;
      int totalInches = feetToInches + inches;
      double result = convertToCentimeters(totalInches);
        return result;
    }
}
