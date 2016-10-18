import java.util.Arrays;
import java.util.Scanner;
public class busnumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int[] bus = new int[num];
		int count = 0;
		int skip = 0;
		for(int i = 0; i < num; i++){
			bus[i] = scan.nextInt();
		}
		Arrays.sort(bus);
		for(int i = 0; i < bus.length; i++){
			int temp = i;
			if(i<bus.length-1&&bus[i] == (bus[i+1]) - 1){
				while(temp<bus.length-1&&bus[temp] == bus[temp+1] - 1){
					skip++;
					temp++;
				}
			}
			if(skip > 1){
				System.out.print(bus[i] + "-");
				i += skip - 1;	 
			}
			else
				System.out.print(bus[i] + " ");
			skip = 0;
			
		}
	}

}
