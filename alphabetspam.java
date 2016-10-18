import java.util.Scanner;
public class alphabetspam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int ascii = 0;
		double whitespace = 0;
		double lower = 0;
		double upper = 0;
		double symbols = 0;
		for(int i = 0; i < input.length(); i++){
			ascii = (int) input.charAt(i);
			if(ascii == 95)
				whitespace++;
			else if((ascii > 32 && ascii < 65) || (ascii > 90 && ascii < 97) || (ascii > 122 && ascii < 127)){
				symbols++;
			}
			else if(ascii > 64 && ascii < 91){
				upper++;
			}
			else if(ascii > 96 && ascii < 123){
				lower++;
			}
		}
		System.out.println(whitespace/input.length());
		System.out.println(lower/input.length());
		System.out.println(upper/input.length());
		System.out.print(symbols/input.length());
	}
}
