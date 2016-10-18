import java.util.Scanner;
public class bishops{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = 0;
		while(scan.hasNextInt()){
			a = scan.nextInt();
			if(a == 0)
				System.out.println(0);
			else if(a == 1)
				System.out.println(1);
			else
				System.out.println(2 * a - 2);
		}
		scan.close();
	}
	
}
