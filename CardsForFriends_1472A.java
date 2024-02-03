import java.util.Scanner;

public class CardsForFriends_1472A {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int t = in.nextInt();

        while (t-- > 0){
            int w = in.nextInt();
            int h = in.nextInt();
            int n = in.nextInt();

            if (n == 1){
                System.out.println("YES");
                continue;
            }
            int ans = 1;
            while (w % 2 == 0){
                ans *= 2;
                w /= 2;
            }

            while (h % 2 == 0){
                ans *= 2;
                h /= 2;
            }

            if (n<= ans){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
