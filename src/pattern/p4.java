package pattern;

public class p4 {
    public static void ftri(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;

                                          }
            System.out.println();
                                     }


                                    }
    public static void main(String[] args) {
        ftri(6);

    }

}





