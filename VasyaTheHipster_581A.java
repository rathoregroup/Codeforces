import java.util.Scanner;

public class VasyaTheHipster_581A {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();

        if (a>b)
            System.out.println(b + " " + (a-b)/2);
        else if (b>a)
            System.out.println(a + " " + (b-a)/2);
        else
            System.out.println((a+b)/2 + " " + 0);

    }
}
