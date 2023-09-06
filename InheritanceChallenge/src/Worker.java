public class Worker {

    private final String name;
    private final String dateOfBirth;
    protected String endDate;

    // Construtor com parâmetros
    public Worker(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Método para obter a idade de um trabalhador
    public int getAge() {
        // Ano atual fixo (2023) - ano de nascimento obtido a partir da data de nascimento
        int currentYear = 2023;
        int birthYear = Integer.parseInt(dateOfBirth.substring(6));

        return currentYear - birthYear;
    }

    // Método para calcular o pagamento do trabalhador (implementação padrão retorna 0)
    public double collectPay() {
        return 0.0;
    }

    // Método para encerrar o contrato de um trabalhador
    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    // Sobrescrita do método toString para retornar uma representação em formato de string do objeto
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
