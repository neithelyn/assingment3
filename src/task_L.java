import java.util.Scanner;

public class task_L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int decimal = 0;
        int base = 1;

        while (x > 0) {
            int digit = x % 10;
            decimal = decimal + digit * base;
            base = base * 2;
            x = x / 10;
        }

        System.out.println(decimal);
    }
}