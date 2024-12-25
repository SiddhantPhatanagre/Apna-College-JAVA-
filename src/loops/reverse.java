package loops;
import java.util.*;
public class reverse {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0) {
            int lastdig = num%10;
            System.out.print(lastdig);
            num= num/ 10;
        }
    }

}
