import java.util.*;

public class SoftDring_151A {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), k = in.nextInt(), l = in.nextInt(), c = in.nextInt(), d = in.nextInt(),p  = in.nextInt(), nl = in.nextInt(), np = in.nextInt();
    int val1 = (k*l)/(nl*n);
    int val2 = c*d/n;
    int val3 = p/(np*n);
        
    System.out.println(Math.min(Math.min(val1, val2),val3));
}
}
