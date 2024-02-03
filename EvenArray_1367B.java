import java.util.*;

public class EvenArray_1367B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] parity = new int[n];
            int a = 0, b = 0;
            for (int i=0; i<n; i++){
                parity[i] = in.nextInt();
            }
            for (int i=0; i<n; i++){
                if (i%2==0 && parity[i]%2==1)
                    a++;
                else if (i%2==1 && parity[i]%2==0)
                    b++;
            }
            
            if (a==b)
                System.out.println(a);
            else
                System.out.println(-1);
        }
    }
}
