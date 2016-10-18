import java.util.Scanner;
public class ladder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int angle = scan.nextInt();
		double rangle = (2 * Math.PI * angle)/360;
		double trig = Math.sin(rangle);
		double hyp = height/trig;
		int hypr = (int) (hyp) + 1;
		System.out.print(hypr);
		scan.close();
	}

}
