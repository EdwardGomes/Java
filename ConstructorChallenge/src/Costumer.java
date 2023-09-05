public class Costumer {

    private final String name;
    private final double creditLimit;
    private final String email;

    public Costumer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Costumer() {
        this("Default Name","test@gmail.com");
    }

    public Costumer(String name, String email) {
        this(name, 500, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
