import java.util.Scanner;
public class speedlimit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int mph = 0;
		int h = 0;
		int oh = 0;
		int sum = 0;
		while(num != -1){
			for(int i = 0; i < num; i++){
				mph = scan.nextInt();
				h = scan.nextInt();
				sum += mph*(h - oh);
				oh = h;
				scan.nextLine();
			}
			System.out.println(sum + " miles");
			sum = 0;
			num = Integer.parseInt(scan.nextLine());
			oh = 0;
		}

	}

}
