import java.util.Scanner;
public class kemija08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		str = str.replaceAll("epe", "e");
		str = str.replaceAll("apa", "a");
		str = str.replaceAll("ipi", "i");
		str = str.replaceAll("opo", "o");
		str = str.replaceAll("upu", "u");
		System.out.print(str);
		scan.close();
	}

}
