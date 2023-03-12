import java.util.*;

class Employee
{
    String employeeId;
    String date;
    String time;
    String type;
    String checkInTime;

    public void checkIn(String checkInTime)
    {
        this.checkInTime = checkInTime;
    }

    public Employee(String employeeId, String date, String time, String type) 
    {
        this.employeeId = employeeId;
        this.date = date;
        this.time = time;
        this.type = type;
    }
}

public class TimeSheet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++)
        {
            String str = sc.nextLine();
            String[] s = str.split("\\s");
            
            Employee e1 = new Employee(s[0], s[1], s[2], s[3]);

            HashMap<String, List<String>> hm = new HashMap<String, List<String>>(); 
            if (hm.containsKey(e1.employeeId))
            {
                
            }

        }
    }
}