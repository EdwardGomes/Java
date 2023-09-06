public class HourlyEmployee extends Employee{

    private final double hourlyPayRate;

    public HourlyEmployee(String name, String dateOfBirth, String hireDate, double hourlyPayRate) {
        super(name, dateOfBirth, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    // Sobrescrita do método collectPay para calcular o pagamento de um trabalhador por hora
    @Override
    public double collectPay() {
        return hourlyPayRate * 40;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
