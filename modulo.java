import java.util.ArrayList;
import java.util.Scanner;
public class modulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
			int n = Integer.parseInt(scan.nextLine()) % 42;
			if(!a.contains(n))
				a.add(n);
		}
        System.out.print(a.size());
        scan.close();
	}

}
