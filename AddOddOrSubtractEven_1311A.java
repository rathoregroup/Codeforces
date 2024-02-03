import java.util.*;

public class AddOddOrSubtractEven_1311A {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int t = in.nextInt();

        while(t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(a == b ? 0 : a > b ? (a - b) % 2 == 0 ? 1 : 2 : (b - a) % 2 != 0 ? 1 : 2);
        }
    }
}
