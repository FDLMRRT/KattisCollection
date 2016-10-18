import java.util.Scanner;
public class quickbrownfox {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i++){
            String s = scan.nextLine().toLowerCase();
            String alpha = "abcdefghijklmnopqrstuvwxyz";
            String miss = "";
            while(alpha.length() > 0){
                String let = alpha.substring(0,1);
                if(s.indexOf(let) < 0){
                    miss += let;
                }
                alpha = alpha.substring(1);
            }
                if(miss.length() > 0){
                    System.out.println("missing " + miss);
                }
                else{
                    System.out.println("pangram");
                }
        }
        
        scan.close();

    }

}