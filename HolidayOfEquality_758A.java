import java.util.*;

public class HolidayOfEquality_758A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int sum=0; 
        int max = Arrays.stream(arr).max().getAsInt();
        for (int i=0; i<n-1; i++){
            arr[i] = max - arr[i];
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
