import java.util.Scanner;
public class wertyu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String s = scan.nextLine();
            String key = "1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./".toUpperCase();
            String oth = "`1234567890-}QWERTYUIOP[]}ASDFGHJKL;}ZXCVBNM,.";
            String output = "";
            
            while(s.length()>0){
                int a = key.indexOf(s.charAt(0));
                if(a<0)
                    output+= " ";
                else
                    output += oth.charAt(a);
                s = s.substring(1);
            }
        
        System.out.println(output);
        }
        scan.close();

    }

}