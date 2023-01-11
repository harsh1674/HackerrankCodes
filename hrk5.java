import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class hrk5 {

    public static void main(String[] argh) {
        
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt();
        
        for(int i=1; i<=T; i+=1) {
            try {
                long x = input.nextLong();
                System.out.println(x +" can be fitted in:");
                if(x>=-128 && x<=127) { System.out.println("* byte"); }
                if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
                    System.out.println("* short"); }
                if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
                    System.out.println("* int"); }
                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
                    System.out.println("* long"); }
            }
            catch(Exception e) {
                System.out.println(input.next()+" can't be fitted anywhere.");
            }
        }
    }
}