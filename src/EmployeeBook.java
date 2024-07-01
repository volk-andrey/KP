public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook() {
        employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 100_000);
        employees[1] = new Employee("Комарова Ольга Александровна", 2, 200_000);
        employees[2] = new Employee("Ильных Константин Борисович", 3, 175_000);
        employees[3] = new Employee("Макаров Алесандр Александрович", 4, 130_000);
        employees[4] = new Employee("Петров Петр Иванович", 5, 150_000);
    }


    public void addNewProfileEmployee(String name, int department, long salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(name, department, salary);
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

    public void deleteProfileEmployee(int id)  {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
        }
    }

    public void getProfileEmployees(int id)  {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Сотрудник с таким ID не найден");
    }

    public void printFullEmployees() {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void getTotalSalary() {
        long totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getsalary();
            }
        }
        System.out.println("Общая трата на заработную плату сотрудникам: " + totalSalary + " рублей");
    }

    public void findMinSalary() {
        long minSalary = Long.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getsalary() < minSalary) {
                minSalary = employee.getsalary();
            }
        }
        System.out.println("Минимальная заработная плата сотрудника:  " + minSalary + " рублей");
    }

    public void findMaxSalary() {
        long maxSalary = Long.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getsalary() > maxSalary) {
                maxSalary = employee.getsalary();
            }
        }
        System.out.println("Максимальная заработная плата сотрудника:  " + maxSalary + " рублей");
    }

    public void getAverageSalary() {
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

    public void printFullNames() {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getfullName());
            }
        }
    }

    public void indexSalariesPercent(double percentIndex) {
        double newSalaries;
        for (Employee employee : employees) {
            if (employee != null) {
                newSalaries = employee.getsalary() + percentIndex * employee.getsalary();
                employee.setSalary((long) newSalaries);
            }
        }
        System.out.println("Заработная плата сотрудников проиндексирована на " + (int) (percentIndex * 100) + "%");
    }

    public void getDepartamentMinSalary(int departament) {
        long minSalary = Long.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament && employee.getsalary() < minSalary) {
                minSalary = employee.getsalary();
            }
        }
        System.out.println("Минимальная заработная плата сотрудника в отделе " + departament + ":  " + minSalary + " рублей");
    }

    public void getDepartamentMaxSalary(int departament)  {
        long maxSalary = Long.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament && employee.getsalary() > maxSalary) {
                maxSalary = employee.getsalary();
            }
        }
        System.out.println("Максимальная заработная плата сотрудника в отделе " + departament + ":  " + maxSalary + " рублей");
    }

    public void getDepartamentAverageSalary(int departament)  {
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

    public void indexDepartamentSalariesPercent(int departament, double percentIndex)  {
        double newSalaries;
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament) {
                newSalaries = employee.getsalary() + percentIndex * employee.getsalary();
                employee.setSalary((long) newSalaries);
            }
        }
        System.out.println("Заработная плата сотрудников в отделе " + departament + " проиндексирована на " + (int) (percentIndex * 100) + "%");
    }

    public void getTotalDepartamentSalaries(int departament)   {
        long totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament) {
                totalSalary += employee.getsalary();
            }
        }
        System.out.println("Общая заработная плата сотрудников в отделе " + departament + ":   " + totalSalary + " рублей");
    }

    public void getDepartament(int departament) {
        System.out.println("Список всех сотрудников в отделе  "  + departament  +  ":");
        for (Employee employee : employees) {
            if (employee != null && employee.getdepartament() == departament) {
                System.out.println(employee.toStringIgnorDepartment());
            }
        }
    }

    public void getSalaryLess(int salary) {
        System.out.println("Список сотрудников с зарплатой меньше " + salary  + " рублей");
        for (Employee employee : employees) {
            if (employee != null && employee.getsalary() < salary) {
                System.out.println(employee.toString());
            }
        }
    }

    public void getSalaryMore(int salary)  {
        System.out.println("Список сотрудников с зарплатой больше " + salary  + " рублей");
        for (Employee employee : employees) {
            if (employee != null && employee.getsalary() >= salary) {
                System.out.println(employee.toStringIgnorDepartment());
            }
        }
    }
}
