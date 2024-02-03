import java.util.*;

public class TheatreSquare_1A {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();

        if ((n * m) % (a * a) == 0){
            System.out.println(1);
        }
        else{
            System.out.println((n * m) % (a * a));
        }

    }
}
