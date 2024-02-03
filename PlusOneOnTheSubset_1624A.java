import java.util.*;

public class PlusOneOnTheSubset_1624A {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int t = in.nextInt();

            while(t-->0){
                int n = in.nextInt();
                int []arr = new int[n];

                for (int i = 0; i < n; i++){
                    arr[i] = in.nextInt();
                }

                for (int i = 0; i < n; i++){
                    for (int j = i; j < n; j++){
                        if (arr[i]>arr[j])
                        {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                System.out.println(arr[n-1]-arr[0]);
            }
    }
}
