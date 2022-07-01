import java.util.*;
public class arrayRotation {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size:");
        int N=sc.nextInt();
        //System.out.println("Size of array is:"+N);
        System.out.println("Enter the elements: ");
        int[] A=new int[N];
       for(int i=0;i<N;i++)
            A[i]=sc.nextInt();
        //for(int i=0;i<N;i++)
        //System.out.println("Element at: "+i+" : "+A[i]);
        //System.out.println(A);
        System.out.println("Enter the value of B:");
        int B=sc.nextInt();
        reverse(A,0,N-1);
        reverse(A,0,B-1);
        reverse(A,B,N-1);
        System.out.println("Rotated array is: ");
        /*for(int i=0;i<N;i++)
        System.out.print(A[i]+" ");*/
        for(int i : A)
        System.out.print(i+" ");
        sc.close();
    }
    public static void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        //return arr;
    }    
}
