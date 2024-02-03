import java.util.Scanner;

public class Elephant_617A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println((x%5==0) ? x/5: (1+x/5));
    }
}
