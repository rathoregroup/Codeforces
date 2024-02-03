import java.util.*;

public class NearlyLuckyNumber_110A {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        long n = in.nextLong();
        long s = 0;
        long f = 0;
        long c = 0;
        while (n != 0){
            long rem = n % 10;
            if (rem == 7){
                s++;
            }
            if (rem == 4){
                f++;
            }
            c++;
            n = n / 10;
        }

        if ((s + f == c) && (f > 0 && s > 0))
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }
}
