import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of phone book");

        int n= scan.nextInt();

        Map<String,String> pBook = new HashMap<>();

        System.out.println("Enter the contacts with name and number");
        for(int i=0;i<n;i++)
        {
            pBook.put(scan.next(),scan.next());
        }
        System.out.println("All contacts are Saved");

        System.out.println("Enter name to display there number or enter EXIT to Stop Searching");
        while (scan.hasNext())
        {
            String s =scan.next();

            if (s.equalsIgnoreCase("EXIT"))
                break;

            if(pBook.containsKey(s))
            {
                System.out.println(s+"="+pBook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }


    }
}
