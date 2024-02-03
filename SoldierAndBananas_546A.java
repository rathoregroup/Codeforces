import java.util.Scanner;

public class SoldierAndBananas_546A{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(), n = in.nextInt(), w=in.nextInt();
        int bill=0;
        for (int i=1; i<=w; i++){
            bill = bill + i*k;
        }
        System.out.println((bill>n) ? (bill-n): 0);
    }
}