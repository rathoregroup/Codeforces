import java.util.*;

public class RestoringThreeNumber_1154A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = new int[4];
        
        for(int ele=0; ele<4; ele++){
            arr[ele] = in.nextInt();
        }

        Arrays.sort(arr);

        for (int i=0; i<3; i++){
            System.out.print(arr[3]-arr[i] + " ");
        }

    
    }
}
