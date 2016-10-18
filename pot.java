import java.util.Scanner;
public class pot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int addend = 0;
		int power = 0;
		int base = 0;
		int total = 0;
		int exp = 0;
		for(int i = 0; i < num; i++){
			addend = Integer.parseInt(scan.nextLine());
			power = addend%10;
			base = (addend - addend%10)/10;
			exp = (int) Math.pow(base, power);
			total = total + exp;
		}
		System.out.print(total);
		scan.close();
	}

}
