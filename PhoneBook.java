import java.util.Scanner;

public class PhoneBook
{
	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);

		System.out.println("Enter no of contacts to be stored");

		int n=in.nextInt();

		String [] cNames = new String[n];

		Integer[] phoneNumbers= new Integer[n];

		for(int i=0;i<n;i++)
		{
			cNames[i]=in.next();

			phoneNumbers[i]=in.nextInt();
		}

		while (in.hasNext()) 
		{
			String s=in.next();

			int i=0;

			for(i=0;i<n;i++)
			{
				if (s.equals(cNames[i]) )
					break;
			}
			if(i==n)
				System.out.println("Not found");
			else
				System.out.println(cNames[i]+"="+phoneNumbers[i]);
		}

	}
}