import java.util.Objects;

public class Employee {

    private Integer employeeId;

    private String employeeName;

    private Integer employeeSalary;

    private Integer employeeAge;

    public Employee(Integer employeeId, String employeeName, Integer employeeSalary, Integer employeeAge) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(employeeName, employee.employeeName) && Objects.equals(employeeSalary, employee.employeeSalary) && Objects.equals(employeeAge, employee.employeeAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeName, employeeSalary, employeeAge);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary='" + employeeSalary + '\'' +
                ", employeeAge=" + employeeAge +
                '}';
    }
}
