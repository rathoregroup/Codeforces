import java.util.*;

public class MinimalSquare_1360A {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();

        while (t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();

            if (a > b){
                if (a <= 2 * b)
                    System.out.println(4 * b * b);
                else
                    System.out.println(a * a);
            }
            else if (b > a){
                if (b <= 2*a)
                    System.out.println(4 * a * a);
                else
                    System.out.println(b * b);
            }
            else
                System.out.println(a * b * 4);
        }
    }
}
