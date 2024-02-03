import java.util.*;

public class MagicalSticks_1371A {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();

        while (t-- > 0){
            int n = in.nextInt();
            System.out.println((int)Math.ceil((double)n / 2));
        }
    }
}
