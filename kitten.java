import java.util.Scanner;
import java.util.ArrayList;
public class kitten {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String l = "";
		Scanner sc = new Scanner(l);
		int branch = Integer.parseInt(scan.nextLine());
		ArrayList<Integer> list = new ArrayList<>();
		while(scan.hasNextLine()){
			l = scan.nextLine();
			list.add(sc.nextInt());
			while(sc.hasNextInt()){
			list.add(0-sc.nextInt());
			}
		}

	    System.out.print(branch + " ");
	    
	}
}
