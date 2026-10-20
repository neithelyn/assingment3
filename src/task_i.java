import java.util.Scanner;

public class task_i {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int count = 0;

        for(int i = 1; i <=a; i++){
            if(a%i == 0){
                count = count +1;
            }
        }
        System.out.println(count);


    }
}
