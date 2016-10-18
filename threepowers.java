import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
public class threepowers
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		BigInteger input = BigInteger.valueOf(0);
		BigInteger zero = BigInteger.valueOf(0);
		BigInteger power3 = BigInteger.valueOf(0);
		String binS = "";
		String backBinS = "";
		while(scan.hasNext())
		{
			input = new BigInteger(scan.nextLine());
			if(input.equals(zero))
				break;
			else
			{
				if(input.equals(BigInteger.valueOf(1)))
					System.out.println("{ }");
				else
				{
					input = input.add(BigInteger.valueOf(-1));
					binS = input.toString(2);
					for(int i = 0; i < binS.length(); i++)
						backBinS = backBinS + binS.charAt(binS.length() - 1 - i);
					ArrayList<BigInteger> fdlmrrt  = new ArrayList<BigInteger>();
					System.out.print("{ ");
					for(int i = 0; i < binS.length(); i++)
					{
						if(backBinS.charAt(i) == '1' )
						{
							power3 = BigInteger.valueOf(3).pow(i);
							fdlmrrt.add(power3);
						}
					}
					for(int j = 0; j < fdlmrrt.size() - 1; j++)
						System.out.print(fdlmrrt.get(j) + ", ");
					System.out.println(power3 + " }");
					input = BigInteger.valueOf(0);
					zero = BigInteger.valueOf(0);
					power3 = BigInteger.valueOf(0);
					binS = "";
					backBinS = "";
				}
			
			}
		}
		scan.close();
	}

}

