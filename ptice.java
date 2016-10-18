import java.util.Scanner;
public class ptice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfQuestions = scan.nextInt();
		String answers = scan.next();
		int adrian = 0;
		int bruno = 0;
		int goran = 0;
		for(int i = 0; i < numOfQuestions; i++){
			char guess = 0;
			if(i%3 == 0)
				guess = 'A';
			else if((i+1)%3 == 0)		
				guess = 'B';
			else 
				guess = 'C';
			if(answers.charAt(i) == guess)
				adrian++;
		}
		for(int i = 0; i < numOfQuestions; i++){
			char guess = 0;
			if(i%4 == 0)
				guess = 'B';
			else if((i-1)%4 == 0)		
				guess = 'A';
			else if((i+2)%4 == 0)
				guess = 'B';
			else 
				guess = 'C';
			if(answers.charAt(i) == guess)
				bruno++;
		}
		for(int i = 0; i < numOfQuestions; i++){
			char guess = 0;
			if(i%6 == 0 || (i-1)%6 == 0)
				guess = 'C';
			else if((i-2)%6 == 0 || (i-3)%6 == 0)		
				guess = 'A';
			else 
				guess = 'B';
			if(answers.charAt(i) == guess)
				goran++;
		}
		int winner = 0;

        if (goran >= adrian) {
            if (goran >= bruno) {
                System.out.println(goran);
                winner = goran;
            } else {
                System.out.println(bruno);
                winner = bruno;
            }
        } else if (adrian >= bruno) {
            System.out.println(adrian);
            winner = adrian;
        } else {
            System.out.println(bruno);
            winner = bruno;
        }

        if (winner == adrian) {
            System.out.println("Adrian");
        }
        if (winner == bruno) {
            System.out.println("Bruno");
        }
        if (winner == goran) {
            System.out.println("Goran");
        }
        scan.close();
	}
}
