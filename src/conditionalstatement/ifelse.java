package conditionalstatement;
import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

    if (age>=18)  {
        System.out.println("you can vote now");
    }
    else {
        System.out.println("you cant vote yet");
    }
    if (age>13 && age<18) {
        System.out.println("youre teenager");
    }
    }
}
