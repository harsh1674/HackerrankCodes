import java.io.*;
import java.util.*;
import java.lang.Math;

public class hrk4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int j = 0; j < t; j++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            for (int i = 0; i < n; i += 1) {
                double power = Math.pow(2, i);
                int result = (int) power;
                int ans = a + (result * b);
                System.out.print(ans);

            }
        }
    }
}
