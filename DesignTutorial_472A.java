import java.util.*;

public class DesignTutorial_472A {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n%2==0)
        System.out.println(8 + " " + (n-8));
        else
        System.out.println(9 + " " + (n-9));
    }
}
