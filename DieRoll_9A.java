import java.util.*;

public class DieRoll_9A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        String []a = {"", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};
        System.out.println(a[Math.max(x, y)]);
    }
}
