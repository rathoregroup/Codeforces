import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumber_1352A {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-->0){
            int n = in.nextInt();
            int ans = 0;
            int m = 1;
            int c = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();           
            while (n>0){
                int rem = n%10;
                ans = rem*m;
                m *= 10;
                if (ans>0){
                    c++;
                    arr.add(ans);
                }
                n = n/10;
            }
            System.out.println(c);
            for (int ele: arr){
                System.out.print(ele + " ");
            }
            System.out.println();

        }


    }
}
