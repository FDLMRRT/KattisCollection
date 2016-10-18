import java.util.Scanner;
public class easiest {

	
	public static int sumDigits(int n) {
		  if(n<10)
		  return n;
		  return (n%10) + sumDigits(n/10);
		}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			int a = scan.nextInt();
			if(a == 0){
				scan.close();
				break;
			}
			int b = sumDigits(a);
			for(int i = 11; true; i++){
				if(sumDigits(i * a) == b){
					System.out.println(i);
					break;
				}
			}	
		}

	}

}
