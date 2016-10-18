import java.util.Scanner;
public class SimonLili {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		String str = "";
		for(int i = 0; i < a; i++){
			str = scan.nextLine();
			if(str.substring(0,12).equals("Simon says "))
				System.out.println(str.substring(12, str.length()-1));
		}

	}

}
