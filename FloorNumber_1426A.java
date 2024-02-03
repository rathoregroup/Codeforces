import java.util.*;

public class FloorNumber_1426A {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();

        while (t-- > 0) {
        int n = in.nextInt();
        int x = in.nextInt();
        if (n == 1 || n == 2){
            System.out.println(1);
        }
        else {
        double app = n - 2;
        System.out.println((int)Math.ceil(app / x + 1));
        }
    }
    }
}
