package variables;

public class typepromotion
{
    public static void main(String[] args) {
        char a = 'a';
        //System.out.println((int) a);
        char b = 'b';
        System.out.println(b-a);     //java automatically take vlaue of char in int hwan it is in expressions
        int ab = 4;
        float sa = 41.34f;
        long i = 54;
        double f = 67;
      double sum = ab + sa + i + f ;
        System.out.println(sum);      // if there is double long in expression then java takes the value in double or long repectively with the help og=f priority order
    }
}
