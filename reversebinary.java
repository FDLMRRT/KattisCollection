import java.util.Scanner;
public class reversebinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String str = Integer.toBinaryString(a);
		String finalstr = "";
		for(int i = 1; i <= str.length(); i++){
			char b = str.charAt(str.length() - i);
			finalstr = finalstr + b;
			}
		System.out.print(Integer.parseInt(finalstr, 2));
		scan.close();
	}

}
