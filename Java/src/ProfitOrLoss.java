import java.util.*;
public class ProfitOrLoss {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int c=sc.nextInt();
        int s= sc.nextInt();
        if(c<s)
        {
            System.out.println(1);
            System.out.println(s-c);
        }
        else
        {
            System.out.println(-1);
            System.out.println(c-s);
        }
        sc.close();
    }
}
