package patterns2.lect1;

public class charspattern {
    public static void main(String[] args) {
        char albh='A';
        for(int line =1;line<6;line++){
            for(int chars= 1;chars<=line;chars++){
                System.out.print(albh);
                albh++;
            }
            System.out.println();

        }
    }
}
