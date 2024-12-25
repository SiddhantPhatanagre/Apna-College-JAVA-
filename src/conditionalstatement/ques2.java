package conditionalstatement;
import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp > 103.4) {
            System.out.println("you have fever");
        } else {
            System.out.println("you dont");
        }
    }
}