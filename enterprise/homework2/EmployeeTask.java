package enterprise.homework2;

public class EmployeeTask extends Employee implements Task<Employee> {

    public EmployeeTask(String name, String surname, String profession) {
        super(name, surname, profession);
    }

    @Override
    public void execute() {

    }

    @Override
    public Employee getResult() {
        return null;
    }
}
