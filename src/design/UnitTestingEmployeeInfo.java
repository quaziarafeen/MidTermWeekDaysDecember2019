package design;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        System.out.println(EmployeeInfo.companyName);
        //Write Unit Test for all the methods has been implemented in this package.
        //Employee information
        EmployeeInfo Employee1 = new EmployeeInfo("Quazi",1);
        //Employee ID
        EmployeeInfo Employee = new EmployeeInfo(1);
        //Employee Bonus
        EmployeeInfo.calculateEmployeeBonus(2,12000,"Best Performance");
        //Employee pension
        double pension= EmployeeInfo.calculateEmployeePension(12000);
        System.out.println(pension);

    }
}
