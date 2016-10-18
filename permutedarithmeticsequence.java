import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class permutedarithmeticsequence {
	public static boolean seqcheck(int[] k){
		for(int i = 0; i < k.length-2; i++){
			int z = k[i+2] - k[i+1];
			int y = k[i+1] - k[i];
			if(y != z)
				return(false);
		}
		return true;
	}
	public static boolean pseqcheck(int[] l){
		Arrays.sort(l);
		return seqcheck(l);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int a = 0;
		for(int i = 0; i < num; i++){
			a = scan.nextInt();
			int[] sequence = new int[a]; 
			for(int j = 0; j  < a; j++){
				sequence[j] = scan.nextInt();
			}
			if(seqcheck(sequence))
				System.out.println("arithmetic");
			else if(pseqcheck(sequence))
				System.out.println("permuted arithmetic");
			else
				System.out.println("non-arithmetic");
		}

		scan.close();
	}
	

}
