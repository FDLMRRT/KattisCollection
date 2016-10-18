import java.util.Scanner;
public class skocimis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sa = a;
		int sb = b;
		int sc = c;
		int count = 0;
		while(!(b - a == 0) && !(c - b == 0)){
			if((b - a) > (c - b)){
				b = a + 1;
				c = sb;
				count++;
			}
			else{
				b = c - 1;
				a = sb;
				count++;
			}
			sa = a;
			sb = b;
			sc = c;
		}
		System.out.print(count - 1);
	}
}
