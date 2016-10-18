import java.util.Scanner;
public class oddities {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 0;
		for(int i = 1; i <= a; i++){
			b = scan.nextInt();
			if(b%2 == 0)
				System.out.println(b + " is even");
			else
				System.out.println(b + " is odd");
				}
		 scan.close();
      }

}
