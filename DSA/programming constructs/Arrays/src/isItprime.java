import java.util.*;
public class isItprime {
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        int count=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i*i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
                if(i!=(a/i))
                count++;
            }
        }
        if(count==2)
        System.out.println("YES");
        else 
        System.out.println("NO");
        sc.close();
    }
}
