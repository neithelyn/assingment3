import java.util.Scanner;

public class task_O {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        boolean zero = false;


        for (int i = 0; i < n; i++) {
            int number = in.nextInt();

            if (number == 0) {
                zero = true;
            }
        }

        if (zero) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}