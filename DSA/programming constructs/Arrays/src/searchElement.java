import java.util.*;
public class searchElement {
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int j=0;j<test;j++)
        {
            int size= sc.nextInt();
            int[] A= new int[size];
            for(int i=0;i<size;i++)
            {
                A[i]=sc.nextInt();
            }
            int b= sc.nextInt();
            int count=0;
            for(int i=0;i<size;i++)
            {
                if(A[i]==b)
                    count++;
            }
            if(count>0)
            System.out.println(1);
            else
            System.out.println(0);
            sc.close();
        }
    }
}
