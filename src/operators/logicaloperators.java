package operators;

public class logicaloperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println((a!=b && a==b));  // && stands for and operator
        System.out.println((a==b || a!=b));  // || stands for or operator
        System.out.println(!(2>3));          // ! indicates logical not operator
    }
}
