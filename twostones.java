import java.util.Scanner;
public class twostones {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if(scan.nextInt()%2 != 0)
			System.out.print("Alice");
		else
			System.out.print("Bob");
		scan.close();
	}

}
