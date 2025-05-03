import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prompter {

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);

    public String promptName() throws Exception
    {
        String name;
        System.out.print("Enter name: ");
        name = reader.readLine();
        return name;
    }

    public String promptNationality() throws Exception
    {
        String nationality;
        System.out.print("Enter nationality: ");
        nationality = reader.readLine();
        return nationality;
    }

    public int promptAge() throws IOException
    {
        int age = 0;
        while(age <= 0 || age > 100)
        {
            System.out.print("Enter age: ");
            age = Integer.parseInt(reader.readLine());
        }
        return age;
    }

     public String promptMotherLanguage() throws Exception
     {
         String motherLanguage;
         System.out.print("Enter mother language: ");
         motherLanguage = reader.readLine();
         return motherLanguage;
     }

     //SchoolName -- done
     //StudentID -- done
     //Section -- done
     //GWA -- done
     //FatherName
     //MotherNae

     //Student Prompt

    public int promptStudentID() throws IOException
    {
        int studentID = 0;

        while(studentID <= 0)
        {
            System.out.print("Enter student ID: ");
            studentID = Integer.parseInt(reader.readLine());
        }

        return studentID;
    }

    public String promptSchoolName() throws Exception
    {
        String schoolName;

        System.out.print("Enter school: ");
        schoolName = reader.readLine();

        return schoolName;
    }

    public String promptSection() throws Exception
    {
        String section;
        System.out.print("Enter section: ");
        section = reader.readLine();
        return section;
    }

    public double promptGWA() throws IOException
    {
        double gwa = 0;
        while (gwa <= 0 || gwa > 5)
        {
            System.out.print("Enter GWA: ");
            gwa = Double.parseDouble(reader.readLine());
        }

        return gwa;
    }

    public String promptFatherName() throws Exception
    {
        String fatherName;
        System.out.print("Enter father's name: ");
        fatherName = reader.readLine();
        return fatherName;
    }
    
    public String promptMotherName() throws Exception
    {
        String motherName;
        System.out.print("Enter mother's name: ");
        motherName = reader.readLine();
        return motherName;
    }

    //Employee -- done
    //Employee ID -- done
    //Type of Employee -- done
    //Salary -- done

    public int promptEmployeeID() throws IOException
    {
        int employeeID = 0;
        while(employeeID <= 0)
        {
            System.out.print("Enter employee ID: ");
            employeeID = Integer.parseInt(reader.readLine());
        }
        return employeeID;

    }

    public String promptTypeOfEmployee() throws Exception
    {
        String typeOfEmployee;
        System.out.print("Type of employee: ");
        typeOfEmployee = reader.readLine();
        return typeOfEmployee;
    }

    public double promptSalary() throws IOException
    {
        double salary = 0;
        while(salary <= 0)
        {
            System.out.print("Enter salary: ");
            salary = Double.parseDouble(reader.readLine());
        }
        return salary;
    }

    //Guest

    public String promptPurposeOfVisit() throws Exception
    {
        String purposeOfVisit;
        System.out.print("Enter purpose of visit: ");
        purposeOfVisit = reader.readLine();
        return purposeOfVisit;
    }

}
