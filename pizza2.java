import java.util.Scanner;
public class pizza2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		double c = scan.nextInt();
		if(r == c)
			System.out.print("0.0000000000000");
		else
		System.out.print(((r - c) * (r - c))/(r * r)*100);
	}

}
