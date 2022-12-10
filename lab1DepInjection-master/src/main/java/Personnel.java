import javax.inject.Inject;

public class Personnel {

    private Employee employee;

    public Personnel() {
    }

    @Inject
    public Personnel(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "employee=" + employee +
                '}';
    }
}
