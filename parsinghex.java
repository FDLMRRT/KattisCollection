import java.util.Scanner;
import java.util.ArrayList;
public class parsinghex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			String str = scan.nextLine();
			int r = 0;
			int count = 0;
			if(str.indexOf("0x") > -1 && ((str.indexOf("0x") < str.indexOf("0X")) || (str.indexOf("0X") == -1)))
				r = str.indexOf("0x");
			else if(str.indexOf("0X") > -1)
				r = str.indexOf("0X");
			String sub = str.substring(r + 1);
			while(true){
				for(int i = r + 2; i < str.length(); i++){
					if(str.charAt(i) == 0 ||str.charAt(i) == 1 ||str.charAt(i) == 2 ||str.charAt(i) == 3 ||str.charAt(i) == 4 ||str.charAt(i) == 5 ||str.charAt(i) == 6 ||str.charAt(i) == 7 ||str.charAt(i) == 8 ||str.charAt(i) == 9 ||str.charAt(i) == 'a' ||str.charAt(i) == 'b' ||str.charAt(i) == 'c' ||str.charAt(i) == 'd' ||str.charAt(i) == 'e' ||str.charAt(i) == 'f' ||str.charAt(i) == 'A' ||str.charAt(i) == 'B' ||str.charAt(i) == 'C' ||str.charAt(i) == 'D' ||str.charAt(i) == 'E' ||str.charAt(i) == 'F')
						count++;
					else
						break;
				}
				break;
			}	
			System.out.println(str.substring(r, r+count) + " " +  Long.parseLong(str.substring(r+2, r+count), 16));
		}
	}
}
