import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class hrk3 {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int N= input.nextInt();
        
        for (int i=1; i<=10; i+=1) {
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
