import java.util.Scanner;

public class CollectingCoins_1294A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int n = in.nextInt();

            int x = a + b + c + n;

            if (x % 3 != 0 || x / 3 < a || x / 3 < b || x / 3 < c){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
