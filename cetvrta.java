import java.util.Scanner;
public class cetvrta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int[] a = {scan.nextInt(), 0, 0};
        int[] b = {scan.nextInt(), 0, 0};
        a[1] = scan.nextInt();
        b[1] = scan.nextInt();
        a[2] = scan.nextInt();
        b[2] = scan.nextInt();
        int c = 0;
        int d = 0;
        if(a[0] == a[1])
        	c = a[2];
        else
        	if(a[1] == a[2])
        	c = a[0];
        	else
        		c = a[1];
        if(b[0] == b[1])
        	d = b[2];
        else
        	if(b[1] == b[2])
        	d = b[0];
        	else
        		d  =b[1];
        System.out.print(c + " " + d);
        scan.close();
	}

}
