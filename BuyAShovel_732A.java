import java.util.Scanner;

public class BuyAShovel_732A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), r = in.nextInt();
        int i = 1;

        while(n*i%10!=0 && n*i%10!=r) i++;

        System.out.println(i);

    }
}
