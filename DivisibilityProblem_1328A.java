import java.util.Scanner;

public class DivisibilityProblem_1328A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =  in.nextInt();

        for (int i=1; i<=t; i++){
            int a = in.nextInt(), b = in.nextInt();

            if (a%b==0){
                System.out.println(0);
            }
            else{
                System.out.println((a/b + 1)*b-a);
            }    
        }
    }
}
