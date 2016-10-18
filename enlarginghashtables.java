import java.util.Scanner;
public class enlarginghashtables {
	
	public static boolean isPrime(int n) {
        if (n < 2){
            return false;
        }
        if (n == 2){
            return true;
        }
        if (n % 2 == 0){
            return false;
        }
        for (int in = 3; in <= Math.sqrt(n) + 1; in = in + 2) {
            if (n % in == 0){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int in = Integer.parseInt(scan.nextLine());
		while(true){
			if(!isPrime(in)){ //not prime
				    for(int l = in * 2 + 1;;l += 2){
					if(isPrime(l)){
						System.out.println(l + " (" + in + " is not prime)");
						break;
					}
				}
			}
			else if(isPrime(in)){ //prime
				for(int l = in * 2 + 1;;l += 2){
					if(isPrime(l)){
						System.out.println(l);
						break;
					}
				}
			}
			in = Integer.parseInt(scan.nextLine());
			if(in == 0)
				break;
		}
		scan.close();
	}
}
