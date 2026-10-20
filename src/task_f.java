    import java.util.Scanner;

    public class task_f {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int c = 0;

            while (a > 0){
                int s = a%10;
                c = c*10+s;
                a = a/10;
            }
            System.out.println(c);

        }
    }
