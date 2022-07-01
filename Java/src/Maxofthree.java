import java.util.*;
public class Maxofthree {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if(a>b)
        {
            if(a>c)
            System.out.print(a);
            else 
            System.out.print(c);
        }
        else{
            if(b>c)
            System.out.print(b);
            else 
            System.out.print(c);
        }
        sc.close();
    }
}
