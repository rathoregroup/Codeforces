import java.util.Scanner;

public class Drinks_200B {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        byte n = in.nextByte();
        int tvol = 0;
        
        for (int i=1; i<=n; i++){
            int vol = in.nextByte();
            tvol = tvol + vol;
        }
        System.out.println((double)tvol/n);
    }
}
