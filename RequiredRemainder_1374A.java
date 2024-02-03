import java.util.*;

public class RequiredRemainder_1374A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-->0){
            int x = in.nextInt(), y = in.nextInt(), n = in.nextInt();
            

            System.out.println(((n-y)/x)*x + y);
        }
    }
}
