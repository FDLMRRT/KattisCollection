import java.util.Scanner;
public class aaahLili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String a= scan.nextLine();
		if (str.length() < a.length())
			System.out.print("no");
		else 
			System.out.print("go");
	}

}
