import java.util.Scanner;

public class CalculationFunuction_486A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(n==1){
            System.out.println(-1);
        }
        else if (n%2==0){
            System.out.println(n/2);
        }
        else
            System.out.println(-(n/2 + 1));
    }
}
