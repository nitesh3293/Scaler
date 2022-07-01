import java.util.*;

public class separateOddEven {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int size=sc.nextInt();
            int[] A= new int[size];
            for(int j=0;j<size;j++)
            {
                A[j]=sc.nextInt();
            }
            int[] odd= new int[size];
            int[] even = new int[size];
            int l=0,m=0;
            for(int j=0;j<size;j++)
            {
                
                if(A[j]%2!=0)
                   {
                        odd[l]=A[j];
                        l++;
                   }
                else
                    {
                        even[m]=A[j];
                        m++;
                    }
            }
            for(int k=0;k<l;k++)
            {
                System.out.print(odd[k]+" ");
            }
            System.out.println();
            for(int k=0;k<m;k++)
            {
                System.out.print(even[k]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

