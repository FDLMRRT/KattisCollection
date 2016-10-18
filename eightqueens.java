import java.util.Scanner;
public class eightqueens {

	public static boolean qcheck(String str){
		int q = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '*')
				q++;
		}
		if(q <= 1)
			return true;
		else
			return false;
	}
	public static boolean lq(String str){
		int q = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '*')
				q++;
		}
		if(q == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String h1 = scan.nextLine();
		String h2 = scan.nextLine();
		String h3 = scan.nextLine();
		String h4 = scan.nextLine();
		String h5 = scan.nextLine();
		String h6 = scan.nextLine();
		String h7 = scan.nextLine();
		String h8 = scan.nextLine();
		String v1 = "" + h1.charAt(0) + h2.charAt(0) + h3.charAt(0) + h4.charAt(0) + h5.charAt(0) + h6.charAt(0) + h7.charAt(0) + h8.charAt(0);
		String v2 = "" + h1.charAt(1) + h2.charAt(1) + h3.charAt(1) + h4.charAt(1) + h5.charAt(1) + h6.charAt(1) + h7.charAt(1) + h8.charAt(1);
		String v3 = "" + h1.charAt(2) + h2.charAt(2) + h3.charAt(2) + h4.charAt(2) + h5.charAt(2) + h6.charAt(2) + h7.charAt(2) + h8.charAt(2);
		String v4 = "" + h1.charAt(3) + h2.charAt(3) + h3.charAt(3) + h4.charAt(3) + h5.charAt(3) + h6.charAt(3) + h7.charAt(3) + h8.charAt(3);
		String v5 = "" + h1.charAt(4) + h2.charAt(4) + h3.charAt(4) + h4.charAt(4) + h5.charAt(4) + h6.charAt(4) + h7.charAt(4) + h8.charAt(4);
		String v6 = "" + h1.charAt(5) + h2.charAt(5) + h3.charAt(5) + h4.charAt(5) + h5.charAt(5) + h6.charAt(5) + h7.charAt(5) + h8.charAt(5);
		String v7 = "" + h1.charAt(6) + h2.charAt(6) + h3.charAt(6) + h4.charAt(6) + h5.charAt(6) + h6.charAt(6) + h7.charAt(6) + h8.charAt(6);
		String v8 = "" + h1.charAt(7) + h2.charAt(7) + h3.charAt(7) + h4.charAt(7) + h5.charAt(7) + h6.charAt(7) + h7.charAt(7) + h8.charAt(7);
		String d1 = "" + h1.charAt(0);
		String d2 = "" + h1.charAt(1) + h2.charAt(0);
		String d3 = "" + h1.charAt(2) + h2.charAt(1) + h3.charAt(0);
		String d4 = "" + h1.charAt(3) + h2.charAt(2) + h3.charAt(1) + h4.charAt(0);
		String d5 = "" + h1.charAt(4) + h2.charAt(3) + h3.charAt(2) + h4.charAt(1) + h5.charAt(0);
		String d6 = "" + h1.charAt(5) + h2.charAt(4) + h3.charAt(3) + h4.charAt(2) + h5.charAt(1) + h6.charAt(0); 
		String d7 = "" + h1.charAt(6) + h2.charAt(5) + h3.charAt(4) + h4.charAt(3) + h5.charAt(2) + h6.charAt(1) + h7.charAt(0);
		String d8 = "" + h1.charAt(7) + h2.charAt(6) + h3.charAt(5) + h4.charAt(4) + h5.charAt(3) + h6.charAt(2) + h7.charAt(1) + h8.charAt(0);
		String d9 = "" + h2.charAt(7) + h3.charAt(6) + h4.charAt(5) + h5.charAt(4) + h6.charAt(3) + h7.charAt(2) + h8.charAt(1);
		String d10 = "" + h3.charAt(7) + h4.charAt(6) + h5.charAt(5) + h6.charAt(4) + h7.charAt(3) + h8.charAt(2);
		String d11 = "" + h4.charAt(7) + h5.charAt(6) + h6.charAt(5) + h7.charAt(4) + h8.charAt(3);
		String d12 = "" + h5.charAt(7) + h6.charAt(6) + h7.charAt(5) + h8.charAt(4);
		String d13 = "" + h6.charAt(7) + h7.charAt(6) + h8.charAt(5);
		String d14 = "" + h7.charAt(7) + h8.charAt(6);
		String d15 = "" + h8.charAt(7);
		String od1 = "" + h8.charAt(0);
		String od2 = "" + h8.charAt(1) + h7.charAt(0);
		String od3 = "" + h8.charAt(2) + h7.charAt(1) + h6.charAt(0);
		String od4 = "" + h8.charAt(3) + h7.charAt(2) + h6.charAt(1) + h5.charAt(0);
		String od5 = "" + h8.charAt(4) + h7.charAt(3) + h6.charAt(2) + h5.charAt(1) + h4.charAt(0);
		String od6 = "" + h8.charAt(5) + h7.charAt(4) + h6.charAt(3) + h5.charAt(2) + h4.charAt(1) + h3.charAt(0); 
		String od7 = "" + h8.charAt(6) + h7.charAt(5) + h6.charAt(4) + h5.charAt(3) + h4.charAt(2) + h3.charAt(1) + h2.charAt(0);
		String od8 = "" + h8.charAt(7) + h7.charAt(6) + h6.charAt(5) + h5.charAt(4) + h4.charAt(3) + h3.charAt(2) + h2.charAt(1) + h1.charAt(0);
		String od9 = "" + h7.charAt(7) + h6.charAt(6) + h5.charAt(5) + h4.charAt(4) + h3.charAt(3) + h2.charAt(2) + h1.charAt(1);
		String od10 = "" + h6.charAt(7) + h5.charAt(6) + h4.charAt(5) + h3.charAt(4) + h2.charAt(3) + h1.charAt(2);
		String od11 = "" + h5.charAt(7) + h4.charAt(6) + h3.charAt(5) + h2.charAt(4) + h1.charAt(3);
		String od12 = "" + h4.charAt(7) + h3.charAt(6) + h2.charAt(5) + h1.charAt(4);
		String od13 = "" + h3.charAt(7) + h2.charAt(6) + h1.charAt(5);
		String od14 = "" + h2.charAt(7) + h1.charAt(6);
		String od15 = "" + h1.charAt(7);
		if(lq(h1) && lq(h2) && lq(h3) && lq(h4) && lq(h5) && lq(h6) && lq(h7) && lq(h8)){
		if(qcheck(h1) && qcheck(h2) && qcheck(h3) && qcheck(h4) && qcheck(h5) && qcheck(h6) && qcheck(h7) && qcheck(h8) && qcheck(v1) && qcheck(v2) && qcheck(v3) && qcheck(v4) && qcheck(v5) && qcheck(v6) && qcheck(v7) && qcheck(v8) && qcheck(d1) && qcheck(d2) && qcheck(d3) && qcheck(d4) && qcheck(d5) && qcheck(d6) && qcheck(d7) && qcheck(d8) && qcheck(d9) && qcheck(d10) && qcheck(d11) && qcheck(d12) && qcheck(d13) && qcheck(d14) && qcheck(d15) && qcheck(od1) && qcheck(od2) && qcheck(od3) && qcheck(od4) && qcheck(od5) && qcheck(od6) && qcheck(od7) && qcheck(od8) && qcheck(od9) && qcheck(od10) && qcheck(od11) && qcheck(od12) && qcheck(od13) && qcheck(od14) && qcheck(od15))
			System.out.print("valid");
		else
			System.out.print("invalid");
		}
		else
			System.out.print("invalid");
		scan.close();
		
	}

}
