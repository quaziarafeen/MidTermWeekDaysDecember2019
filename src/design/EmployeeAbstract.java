package design;

public abstract class EmployeeAbstract implements Employee {
    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

    void benefits( ){
        System.out.println("there is no benefit in Abstract class.");
    }




}
