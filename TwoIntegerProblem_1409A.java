import java.util.*;

public class TwoIntegerProblem_1409A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();

        int t = in.nextInt();

        while(t-->0){
            int a = in.nextInt(), b = in.nextInt();

            System.out.println((Math.abs(a-b)+9)/10);
                       
        }
    }
}
