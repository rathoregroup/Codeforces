import java.util.Scanner;

public class NewYearAndHurry_750A {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int sum = 0;
        int ques;
        for (ques=1; ques<=n; ques++){
            sum += ques*5;
            if (k+sum>240)
                break;
        }
        System.out.println(ques-1);
    }
}
