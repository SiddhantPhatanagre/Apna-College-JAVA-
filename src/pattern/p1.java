package pattern;

public class p1 {
    public static void hollow_rectangle(int totr , int totc){
        for(int i=1;i<=totr;i++){
            for(int j = 1; j<=totc; j++){
                if(i==1 || i==totr || j==1 || j==totc){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle( 4, 8);
    }
}
