import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);
    //Custom class
    public static Display display = new Display();
    public static Student student = new Student();
    public static Employee employee = new Employee();
    public static Guest guest = new Guest();


    public void CommandLine()
    {
        boolean flag = true;
        int input = 0;
        while(flag)
        {
            try
            {
                display.MenuOptions();
                input = Integer.parseInt(reader.readLine());
                switch (input)
                {
                    case 1:
                        student.enterDetails();
                        student.display();
                        break;
                    case 2:
                        employee.enterDetails();
                        employee.display();
                        break;
                    case 3:
                        guest.enterDetails();
                        guest.display();
                        break;
                    case 4:
                        flag = false;
                        break;
                    default:
                        break;
                }
            }
            catch (IOException ioe)
            {

            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
    }

}
