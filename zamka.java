import java.util.Scanner;
public class zamka {
	
	
	public static int sumDigits(int n) {
		  if(n<10)
		  return n;
		  return (n%10) + sumDigits(n/10);
		}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		int sum = scan.nextInt();
		int a = 0;
		int b = 0;
		for(int i = min; i <= max; i++){
			if(i < 10 && i == sum)
				a = i;
			else if(i > 10 && (sumDigits(i) == sum))
				a = i;
			if(a > 0)
				break;
		}	
		System.out.println(a);
		for(int i = max; i >= min; i--){
			if(i < 10 && i == sum)
				b = i;
			else if(i > 10 && (sumDigits(i) == sum))
					b = i;
			if(b > 0)
				break;
		}
		System.out.print(b);
		scan.close();
		}
	}

