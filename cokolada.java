import java.util.Scanner;
public class cokolada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int ph = 0;
		double p2 = 1;
		if(Integer.bitCount(a) == 1)
			System.out.print(a + " " + "1");
		else{
			while(p2 < a){
				p2 *= 2;
			}
				String bin = Integer.toBinaryString(a);
			for(int i = bin.length() - 1; i > 0; i--){
				if(bin.charAt(i) == '1'){
					ph = i + 1;
					break;
				}
			}
			System.out.print((int) p2 + " " + ph);
		}

	}

}
