import java.util.Scanner;

public class BalancedArray_1343B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t -- > 0){
            int n = in.nextInt();
            int[] nums = new int[n];
            int ele = 2;
            int sum1 = 0;
            for (int i = 0; i < n / 2; i++){
                nums[i] = ele;
                sum1 += nums[i];
                ele += 2;
            }

            int sum2 = 0;
            ele = 1;
            int n2 = n/2;
            while (n2 < n){
                nums[n2] = ele;
                sum2 += nums[n2];
                ele += 2;
                
                if (sum2 < sum1 && n2 == (n-1)){
                    sum2 -= nums[n2];
                    continue;
                }
                n2++;
            }

            if (sum1 == sum2){
                System.out.println("Yes");
                for (int i = 0; i < n; i++){
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("No");
            }

            
        }
    }
}
