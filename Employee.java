import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Employee extends Person{
    private int employeeID;
    private String typeOfEmployee;
    private double salary;

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setNationality(String nationality) {
        super.setNationality(nationality);
    }

    @Override
    public void setMotherLanguage(String motherLanguage) {
        super.setMotherLanguage(motherLanguage);
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setTypeOfEmployee(String typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getNationality() {
        return super.getNationality();
    }

    @Override
    public String getMotherLanguage() {
        return super.getMotherLanguage();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getTypeOfEmployee() {
        return typeOfEmployee;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void enterDetails() throws Exception {
        super.enterDetails();
        employeeID = prompt.promptEmployeeID();
        typeOfEmployee = prompt.promptTypeOfEmployee();
        salary = prompt.promptSalary();

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Job: " + typeOfEmployee);
        System.out.printf("Salary %.2f\n", salary);
    }
}
