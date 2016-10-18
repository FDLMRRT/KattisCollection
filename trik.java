import java.util.Scanner;
public class trik {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char a = 'a';
        String string = "123";
        char b = 'a';
        char c = 'a';
        char d = 'a';
		for(int i = 0; i < str.length(); i++){
			a = str.charAt(i);
		    if(a == 'A'){
		    	b = string.charAt(0);
		    	c = string.charAt(1);
		    	d = string.charAt(2);
		        string = "" + c + b + d;
		    }
		    else if(a == 'B'){
		    	b = string.charAt(0);
		    	c = string.charAt(1);
		    	d = string.charAt(2);
		    	string = "" + b + d + c;
		    }
		    else if(a == 'C'){
		    	b = string.charAt(0);
		    	c = string.charAt(1);
		    	d = string.charAt(2);
		    	string = "" + d + c + b;
		    }
	}
    System.out.print(string.indexOf('1') + 1);
    scan.close();
}
}
