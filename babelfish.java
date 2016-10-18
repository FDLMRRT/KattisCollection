import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class babelfish {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> sclel = new HashMap<>();
        String cancer = "";
        String cancer2 = "";
        String key = "";
        String ans = "";
        int space = 0;
        while(true){
            cancer = scan.nextLine();
            if(cancer.equals(""))
                break;
            space = cancer.indexOf(" ");
            key = cancer.substring(0, space);
            ans = cancer.substring(space + 1);
            sclel.put(ans, key);
            
        }
        while(scan.hasNext()){
            cancer2 = scan.nextLine();
        if(sclel.containsKey(cancer2))
                System.out.println(sclel.get(cancer2));
        else
            System.out.println("eh");
        }
    }

}
