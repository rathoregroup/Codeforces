import java.util.Scanner;

public class OddSet_1542A {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int t = in.nextInt();

        while (t-- > 0){
            int n = in.nextInt();
            int [] arr = new int[2*n];

            for (int i = 0; i < 2 * n; i++){
                arr[i] = in.nextInt();
            }

            int o = 0, e = 0;
            for (int i = 0; i < 2 * n; i++){
                if (arr[i] % 2 != 0){
                    o++;
                }
                else{
                    e++;
                }
            }

            System.out.println(o == e ? "YES" : "NO");
        }
    }
}
