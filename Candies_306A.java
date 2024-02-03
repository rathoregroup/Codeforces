import java.util.Scanner;

public class Candies_306A {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long in = sc.nextLong();
    long i = 1;
    long sum=0;
    long count = 0;
    while(sum<=in){
        if(sum==in || sum+i>in){
            break;
        }
      sum+=i;
      i++;
    }
    System.out.println(in - sum == 0 ? i-1 : in-sum);
    }
}
