import java.util.Scanner;
public class different {

	public static void main(String[] args) {
		//while(scan.hasNextLong())
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLong()){
			long[] a = {scan.nextLong(), scan.nextLong()};
			long A = Math.abs(a[1] - a[0]);
			System.out.println(A);
		}
		scan.close();
	}

}
