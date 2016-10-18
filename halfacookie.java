import java.util.Scanner;
public class halfacookie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = 0;
		double x = 0;
		double y = 0;
		double area1 = 0;
		double area2 = 0;
		double angle = 0;
		while(scan.hasNext()){
			 r = scan.nextDouble(); // there are weird chords... not x or y...
			 x = scan.nextDouble();
			 y = scan.nextDouble();
			 scan.nextLine();
			if(Math.sqrt(Math.pow(x, 2) + Math.pow(y,  2)) >= r){
				System.out.println("miss");
			}
			else{
				if(Math.abs(x) > Math.abs(y)){
					angle = Math.atan(Math.sqrt((Math.pow(r,  2) - Math.pow(x,  2)))/x);
					area1 = ((Math.PI * r * r * angle/(2*Math.PI)) - ((x * (Math.sqrt(Math.pow(r,  2) - Math.pow(x,  2))))/2))*2;
				}
				else{
					angle =  Math.atan(Math.sqrt((Math.pow(r,  2) - Math.pow(y,  2)))/y);
					area1 = ((Math.PI * r * r * angle/(2*Math.PI)) - ((y * (Math.sqrt(Math.pow(r,  2) - Math.pow(y,  2))))/2))*2;
				}
					//System.out.println(angle);
					area2 = (Math.PI * r * r) - area1;
					System.out.println(area2 + " " + area1);
			}
			 r = 0;
			 x = 0;
			 y = 0;
			 area1 = 0;
			 area2 = 0;
			 angle = 0;
		}
		scan.close();
	}

}
