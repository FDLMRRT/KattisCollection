import java.util.Scanner;
import java.util.ArrayList;
public class pervasiveheartmonitor
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Double> numbers = new ArrayList<>();
		String str = "";
		double num = 0;
		while(scan.hasNextLine())
		{
		String line = scan.nextLine();
		Scanner ls = new Scanner(line);
		double avg = 0;
		while(ls.hasNext())
			{
				str = ls.next();
				try
				{
					num = Double.parseDouble(str);
					numbers.add(num);
				}
				catch(NumberFormatException e)
				{
					name.add(str);
				}
			}
			for(int i = 0; i < numbers.size(); i++)
			{
				avg += numbers.get(i);
			}
			avg = avg/numbers.size();
			System.out.print(avg + " ");
			if(name.size() == 1)
				System.out.println(name.get(0));
			else
			{
			for(int i = 0; i < name.size() - 1; i++)
				{
				System.out.print(name.get(i) + " ");
				}
			System.out.println(name.get(name.size() - 1));
			}
			str = "";
			num = 0;
			avg = 0;
			name.clear();
			numbers.clear();
		}
		scan.close();
	}

}
