public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.printFullEmployees();
        printSeparator();

        employeeBook.getTotalSalary();
        printSeparator();

        employeeBook.findMinSalary();
        printSeparator();

        employeeBook.findMaxSalary();
        printSeparator();

        employeeBook.getAverageSalary();
        printSeparator();

        employeeBook.printFullNames();
        printSeparator();

        employeeBook.indexSalariesPercent(0.14);
        employeeBook.printFullEmployees();
        printSeparator();

        employeeBook.getDepartamentMinSalary(1);
        printSeparator();

        employeeBook.getDepartamentMaxSalary(4);
        printSeparator();

        employeeBook.getTotalDepartamentSalaries(1);
        printSeparator();

        employeeBook.addNewProfileEmployee("Николаев Николай Николаевич",  1,  300_000);
        employeeBook.getDepartamentAverageSalary(1);
        printSeparator();

        employeeBook.indexDepartamentSalariesPercent(1, 0.3);
        printSeparator();

        employeeBook.getDepartament(1);
        printSeparator();

        employeeBook.getSalaryLess(180_000);
        printSeparator();

        employeeBook.getSalaryMore(160_000);
        printSeparator();

        employeeBook.addNewProfileEmployee("Николаев Николай Николаевич",  1,  300_000);
        employeeBook.addNewProfileEmployee("Николаев Николай Николаевич",  2,  180_000);
        employeeBook.addNewProfileEmployee("Николаев Николай Николаевич",  3,  120_000);
        employeeBook.addNewProfileEmployee("Николаев Николай Николаевич",  4,  100_000);
        employeeBook.printFullEmployees();
        printSeparator();

        employeeBook.deleteProfileEmployee(5);
        employeeBook.deleteProfileEmployee(6);
        employeeBook.deleteProfileEmployee(7);
        employeeBook.deleteProfileEmployee(8);
        employeeBook.deleteProfileEmployee(9);
        employeeBook.printFullEmployees();
        printSeparator();

        employeeBook.getProfileEmployees(3);
        employeeBook.getProfileEmployees(9);
        printSeparator();
    }



    public static void printSeparator()  {
        System.out.println("------------------------------------------------------");
    }
}
