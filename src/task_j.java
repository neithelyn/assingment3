import java.util.Scanner;

public class task_j {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int cout = 0;

        for(int i = 1; i <=100; i++){
            int a = in.nextInt();
            cout += a;
        }
        System.out.println(cout);
    }
}
