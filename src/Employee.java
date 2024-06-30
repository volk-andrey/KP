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

    public static void printFullEmployees(Employee[] employees) {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void getTotalSalary(Employee[] employees) {
        long totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getsalary();
            }
        }
        System.out.println("Общая трата на заработную плату сотрудникам: " + totalSalary + " рублей");
    }

    public static void findMinSalary(Employee[] employees) {
        long minSalary = Long.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getsalary() < minSalary) {
                minSalary = employee.getsalary();
            }
        }
        System.out.println("Минимальная заработная плата сотрудника:  " + minSalary + " рублей");
    }

    public static void findMaxSalary(Employee[] employees) {
        long maxSalary = Long.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getsalary() > maxSalary) {
                maxSalary = employee.getsalary();
            }
        }
        System.out.println("Максимальная заработная плата сотрудника:  " + maxSalary + " рублей");
    }

    public static void getAverageSalary(Employee[] employees) {
        long totalSalary = 0;
        int checks = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getsalary();
                checks++;
            }
        }
        long averageSalary = totalSalary / checks;
        System.out.println("Средняя заработная плата сотрудника:   " + averageSalary + " рублей");
    }

    public static void printFullNames(Employee[] employees) {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getfullName());
            }
        }
    }

    public static void indexSalariesPercent(Employee[] employees, double percentIndex) {
        double newSalaries;
        for (Employee employee : employees) {
            if (employee != null) {
                newSalaries = employee.getsalary() + percentIndex * employee.getsalary();
                employee.setSalary((long) newSalaries);
            }
        }
        System.out.println("Заработная плата сотрудников проиндексирована на " + (int) (percentIndex * 100) + "%");
    }

    public static void getDepartamentMinSalary(Employee[] employees, int departament) {
        long minSalary = Long.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament && employee.getsalary() < minSalary) {
                minSalary = employee.getsalary();
            }
        }
        System.out.println("Минимальная заработная плата сотрудника в отделе " + departament + ":  " + minSalary + " рублей");
    }

    public static void getDepartamentMaxSalary(Employee[] employees, int departament)  {
        long maxSalary = Long.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament && employee.getsalary() > maxSalary) {
                maxSalary = employee.getsalary();
            }
        }
        System.out.println("Максимальная заработная плата сотрудника в отделе " + departament + ":  " + maxSalary + " рублей");
    }

    public static void getDepartamentAverageSalary(Employee[] employees, int departament)  {
        long totalSalary = 0;
        int checks = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament) {
                totalSalary += employee.getsalary();
                checks++;
            }
        }
        long averageSalary = totalSalary / checks;
        System.out.println("Средняя заработная плата сотрудника в отделе " + departament + ":   " + averageSalary + " рублей");
    }

    public static void indexDepartamentSalariesPercent(Employee[] employees, int departament, double percentIndex)  {
        double newSalaries;
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament) {
                newSalaries = employee.getsalary() + percentIndex * employee.getsalary();
                employee.setSalary((long) newSalaries);
            }
        }
        System.out.println("Заработная плата сотрудников в отделе " + departament + " проиндексирована на " + (int) (percentIndex * 100) + "%");
    }

    public static void getTotalDepartamentSalaries(Employee[] employees, int departament)   {
        long totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament) {
                totalSalary += employee.getsalary();
            }
        }
        System.out.println("Общая заработная плата сотрудников в отделе " + departament + ":   " + totalSalary + " рублей");
    }

    public static void getDepartament(Employee[] employees, int departament) {
        System.out.println("Список всех сотрудников в отделе  "  + departament  +  ":");
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament) {
                System.out.println(employee.toStringIgnorDepartment());
            }
        }
    }

    public static void getSalaryLess(Employee[] employees, int salary) {
        System.out.println("Список сотрудников с зарплатой меньше " + salary  + " рублей");
        for (Employee employee : employees) {
            if (employee != null && employee.getsalary() < salary) {
                System.out.println(employee.toString());
            }
        }
    }

    public static void getSalaryMore(Employee[] employees, int salary)  {
        System.out.println("Список сотрудников с зарплатой больше " + salary  + " рублей");
        for (Employee employee : employees) {
            if (employee != null && employee.getsalary() >= salary) {
                System.out.println(employee.toStringIgnorDepartment());
            }
        }
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
