import java.util.Scanner;
import java.lang.String;
public class Burp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How long is your burp");
        int length = in.nextInt();
        String msg="";
        for(int i=1;i<=length;i++) {
            msg = msg+"r";
        }
        System.out.println("Bu"+msg+"p");
    }
}
