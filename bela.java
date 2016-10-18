import java.util.Scanner;
public class bela {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int a = scan.nextInt();
		String str = scan.next();
		String var = "";
		for(int i = 0; i < 4*a; i++){
			var = scan.next();
			if(var.charAt(0) == 'Q')
				total = total + 3;
			else if(var.charAt(0) == 'K')
				total = total + 4;
			else if(var.charAt(0) == 'A')
				total = total + 11;
			else if(var.charAt(0) == 'T')
				total = total + 10;
			else if(var.charAt(0) == '9' && var.charAt(1) == str.charAt(0))
				total = total + 14;
			else if(var.charAt(0) == 'J' && var.charAt(1) == str.charAt(0))
				total = total + 20;
			else if(var.charAt(0) == 'J')
				total = total + 2;
			}
		System.out.print(total);
		scan.close();
				
		}

	

}
