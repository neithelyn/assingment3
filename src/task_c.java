import java.util.Scanner;

public class task_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i >= 0) {
                int root = (int) Math.sqrt(i);
                if (root * root == i) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}