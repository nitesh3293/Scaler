import java.util.*;

public class SummationGame {
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sum=a*(a+1)/2;
        System.out.print(sum);
        sc.close();
    }
}
