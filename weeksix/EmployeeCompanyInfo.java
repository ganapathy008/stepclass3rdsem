package stepclass3rdsem.weeksix;
class EmployeeCompany {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeCompany(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeCompanyInfo {
    public static void main(String[] args) {
        new EmployeeCompany("Divya", 65000);
        new EmployeeCompany("Arjun", 30000);
        new EmployeeCompany("Priya", 40000);

        EmployeeCompany.printCompanyInfo();
    }
}

