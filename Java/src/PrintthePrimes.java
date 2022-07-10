import java.util.*;
public class PrintthePrimes {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==1)
            System.out.println(i);
        }
        sc.close();
    }
}
