public class Employee extends Worker{

    private long employeeId;
    private String hireDate;
    private static int employeeNumber = 1;

    public Employee() {
    }
    public Employee(String name, String dateOfBirth, String hireDate) {
        super(name, dateOfBirth);
        this.employeeId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }

    // Sobrescrita do método toString para retornar uma representação em formato de string do objeto (incluindo os atributos da classe pai)
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
