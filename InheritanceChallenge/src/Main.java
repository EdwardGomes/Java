public class Main {
    public static void main(String[] args) {

        Employee edward = new Employee("Edward", "02/10/1999", "01/01/2010");

        System.out.println(edward);
        System.out.println("Age: " + edward.getAge());
        System.out.println("Pay: " + edward.collectPay());

        HourlyEmployee harry = new HourlyEmployee("Harry", "02/10/1997", "01/09/2010", 20.0);
        System.out.println(harry);
        System.out.println("Age: " + harry.getAge());
        System.out.println("Pay: " + harry.collectPay());
        System.out.println("Double Pay: " + harry.getDoublePay());
    }
}
