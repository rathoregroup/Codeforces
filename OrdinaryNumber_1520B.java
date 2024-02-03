import java.util.Scanner;

public class OrdinaryNumber_1520B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0){
            int n = in.nextInt();
            int count = 0;
            
            for (int i = 1; i <= 9; i++){
                long num = i;
                while (num <= n){
                    count++;
                    num = num * 10 + i;
                }
            }
            System.out.println(count);
        }
    }
}
