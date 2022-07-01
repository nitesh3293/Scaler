import java.util.*;
public class Categoriesthenumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1)
        System.out.print(1);
        else if(a==0)
        System.out.print(0);
        else
        System.out.print(-1);
        sc.close();
    }
}
