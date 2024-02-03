import java.util.Scanner;
import java.util.Arrays;

public class TheNewYear_723A {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        int [] arr = new int[3];
        int i = 0;
        for (int ele : arr){
            arr[i] = in.nextInt();
            i++;
        }
        Arrays.sort(arr);

        System.out.println((arr[1]-arr[0])+(arr[2]-arr[1]));
        
    }
}
