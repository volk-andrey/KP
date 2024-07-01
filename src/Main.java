public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 100_000);
        employees[1] = new Employee("Комарова Ольга Александровна", 2, 200_000);
        employees[2] = new Employee("Ильных Константин Борисович", 3, 175_000);
        employees[3] = new Employee("Макаров Алесандр Александрович", 4, 130_000);
        employees[4] = new Employee("Петров Петр Иванович", 5, 150_000);





        Employee.printFullEmployees(employees);
        printSeparator();

        Employee.getTotalSalary(employees);
        printSeparator();

        Employee.findMinSalary(employees);
        printSeparator();

        Employee.findMaxSalary(employees);
        printSeparator();

        Employee.getAverageSalary(employees);
        printSeparator();

        Employee.printFullNames(employees);
        printSeparator();

        Employee.indexSalariesPercent(employees,0.14);
        Employee.printFullEmployees(employees);
        printSeparator();

        Employee.getDepartamentMinSalary(employees,1);
        printSeparator();

        Employee.getDepartamentMaxSalary(employees,4);
        printSeparator();

        Employee.getTotalDepartamentSalaries(employees,1);
        printSeparator();

        employees[5] = new Employee("Николаев Николай Николаевич",  1,  300_000);
        Employee.getDepartamentAverageSalary(employees,1);
        printSeparator();

        Employee.indexDepartamentSalariesPercent(employees,1, 0.3);
        printSeparator();

        Employee.getDepartament(employees,1);
        printSeparator();

        Employee.getSalaryLess(employees, 180_000);
        printSeparator();
        Employee.getSalaryMore(employees,  160_000);
        printSeparator();
    }


    public static void printSeparator()  {
        System.out.println("------------------------------------------------------");
    }
}
