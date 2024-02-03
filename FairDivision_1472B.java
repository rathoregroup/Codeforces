import java.util.*;

public class FairDivision_1472B {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        while (t-- > 0){
            int n = in.nextInt();
            int c1 = 0;
            int c2 = 0;
            
            int[] a = new int[n];

            for (int i = 0; i < n; i++){
                a[i] = in.nextInt();
                if (a[i] == 1){
                    c1++;
                }
                if (a[i] == 2){
                    c2++;
                }
            }
            if (c1 % 2 == 1)
                System.out.println("NO");
            else
                if ((c2 % 2 == 1 && c1 >= 2) || c2 % 2 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
        }
    }
}
