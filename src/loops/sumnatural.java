package loops;
import java.util.*;
public class sumnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int i=1;
        while (i<=a) {
            b=b+i;
            i++;
        } System.out.println(b);

    }
}
