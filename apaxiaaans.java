import java.util.Scanner;
public class apaxiaaans {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		for(int i = 0; i < 26; i++) {
			char c = (char)('a' + i);
			String s = "" + c + c;
			String sp = "" + c;
			while (name.contains(s)) {
				name = name.replace(s, sp);
			}
		}
		System.out.println(name);
	}
}
