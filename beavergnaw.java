import java.util.Scanner;
public class beavergnaw {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
    while(true)
    {
        int D = scan.nextInt();
        int V = scan.nextInt();
        if(D==0 && V==0)
            break;
        double d = Math.pow(D*D*D-6*V/Math.PI,1.0/3);
        System.out.println(d);


	}
	}
}