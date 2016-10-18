import java.util.Scanner;
public class pet {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int old = 0;
		int current = 0;
		int num = 0;
		for(int j = 0; j < 5; j++){
		for(int i = 0; i < 4; i++){
			current += scan.nextInt();
		}
		if(current > old)
			num = j + 1;
		old = Math.max(old, current);
		current = 0;
		}
		System.out.print(num + " " + old);
		scan.close();
	}

}
