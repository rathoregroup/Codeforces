import java.util.*;

public class BoringApartments_1433A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-->0){
            int x = in.nextInt();
            int y = (x%10-1)*10;
            int c = 0;
            int temp = x;
            int sum = 0;
            while(temp!=0){
                c++;
                temp = temp/10;
            }
            c = (c*(c+1))/2;
            System.out.println(y+c);
        }
    }
}
