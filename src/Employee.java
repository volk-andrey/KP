import java.util.Objects;

public class Employee {
    private final String fullName;
    private int departament;
    private long salary;
    private final int id;

    private static int nextId = 0;

    public Employee(String fullName, int department, long salary) {
        this.fullName = fullName;
        this.departament = department;
        this.salary = salary;
        this.id = nextId++;
    }

    public String getfullName() {
        return fullName;
    }

    public int getdepartament() {
        return departament;
    }

    public long getsalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String toStringIgnorDepartment() {
        return "id = "  + id +
                ", ФИО:'" + fullName + '\'' +
                ", ЗП = " + salary;
    }

    @Override
    public String toString() {
        return "ФИО:'" + fullName + '\'' +
                ", отдел:" + departament +
                ", ЗП = " + salary +
                ", id = "   + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departament == employee.departament && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departament, id);
    }
}
