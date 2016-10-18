import java.util.Scanner;
public class cold {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 0;
		int c = 0;
		for(int i = 0; i < a; i++){
			b = scan.nextInt();
			if(b < 0)
				c++;
			
		}
		System.out.print(c);
		scan.close();
	}

}
