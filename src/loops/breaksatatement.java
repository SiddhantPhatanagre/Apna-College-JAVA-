package loops;

public class breaksatatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 1) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
    }
}