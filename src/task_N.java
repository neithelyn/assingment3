import java.util.Scanner;

public class task_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int post = 0;
        int neg = 0;
        int zero = 0;

        for(int i = 1; i <=a; i++){
            int b = in.nextInt();
            if(b > 0){
                post += 1;
            }else if(b<0){
                neg += 1;
            }else {
                zero += 1;
            }
        }
        System.out.println(zero + " "+ post + " "+ neg);
    }
}
