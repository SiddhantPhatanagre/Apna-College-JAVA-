package loops;
import java.util.*;

public class multof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){int num = sc.nextInt();
            if(num%10==0){
                break;
            }System.out.println(num);

        }
    }
}
