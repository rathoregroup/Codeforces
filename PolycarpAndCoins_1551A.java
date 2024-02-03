import java.util.*;

public class PolycarpAndCoins_1551A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0){
            int n = in.nextInt();
            int a = (n+1) / 3;

            System.out.println(n - 2*a + " " + a);
        }
    }
}
