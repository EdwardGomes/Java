public class Main {
    public static void main(String[] args) {

        Costumer costumer1 = new Costumer();
        Costumer costumer2 = new Costumer("John", costumer1.getCreditLimit(), "John@gmail.com");
        Costumer costumer3 = new Costumer("Jane", "JaneDoe@gmail.com");

        System.out.println("Costumer 1: " + costumer1.getName() + ", " + costumer1.getCreditLimit() + ", " + costumer1.getEmail());
        System.out.println("Costumer 2: " + costumer2.getName() + ", " + costumer2.getCreditLimit() + ", " + costumer2.getEmail());
        System.out.println("Costumer 3: " + costumer3.getName() + ", " + costumer3.getCreditLimit() + ", " + costumer3.getEmail());
    }
}
