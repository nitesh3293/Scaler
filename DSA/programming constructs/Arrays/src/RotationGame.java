    import java.util.*;
public class RotationGame {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++)
            A[i]=sc.nextInt();
        //System.out.print(A);
        int B=sc.nextInt();
        if(B>N)
        B=B%N;
        reverse(A,0,N-1);
        reverse(A,0,B-1);
        reverse(A,B,N-1);
        for(int i=0;i<N;i++)
        System.out.print(A[i]+" ");
        sc.close();
    }
    public static int[] reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        return arr;
    }    
    
}

