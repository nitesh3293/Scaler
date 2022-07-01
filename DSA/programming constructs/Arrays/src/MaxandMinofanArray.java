import java.util.*;

public class MaxandMinofanArray {
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] A= new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int min=A[0];
        int max=A[0];
        for(int i=1;i<n;i++)
            {
                min=min<A[i] ? min: A[i];
                max= max>A[i]? max: A[i];
            }
        System.out.print(max+" "+min);
        sc.close();
    }
}

