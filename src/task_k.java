import java.util.Scanner;

public class task_k {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int cout = 0;

        for(int i = 1; i <=a; i++){
            int b = in.nextInt();
            cout += b;
        }
        System.out.println(cout);
    }
}
