import java.util.Arrays;
import java.util.Scanner;
public class lineup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfLines = Integer.parseInt(scan.nextLine());
		String[] ordered = new String[numOfLines];
		String[] original = new String[numOfLines];
		int score = 0;
		for(int i = 0; i < numOfLines; i++){
			ordered[i] = scan.nextLine();
		}
		for(int i = 0; i < numOfLines; i++){
			original[i] = ordered[i];
		}
		Arrays.sort(ordered);
		for(int i = 0; i < numOfLines; i++){
			if(original[i].equals(ordered[i]))
				score++;
			if(original[i].equals(ordered[numOfLines-1-i]))
				score--;
		}
		if(numOfLines%2 == 0){
			if(score == numOfLines)
				System.out.print("INCREASING");
			else if(score == -numOfLines)
				System.out.print("DECREASING");
			else
				System.out.print("NEITHER");
		}
		else{
		if(score == numOfLines-1)
			System.out.print("INCREASING");
		else if(score == -numOfLines+1)
			System.out.print("DECREASING");
		else
			System.out.print("NEITHER");
		}
		scan.close();
		
	}
}
