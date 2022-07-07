import java.util.*;
public class leadersInAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] A= new int[n];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int[] result= new int[n];
        result=solve(A);
        for(int i=0;i<n;i++)
        System.out.println("Result :"+result[i]);
        sc.close();        
    }
     public static int[] solve(int[] A) {
        int n=A.length;
        int[] rmax= new int[n];
        int[] res= new int[n];
        rmax[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(rmax[i+1],A[i]);
        }
        for(int i=0;i<n;i++)
        System.out.println("Rmax at"+i+" : "+rmax[i]);
        int l=0;
        for(int i=0;i<n-2;i++)
        {
            if(rmax[i]>rmax[i+1])
            {
                res[l]=rmax[i];
                l++;
            }
        }
        for(int i=0;i<l;i++)
        System.out.println(res[i]);

        return res;
    }
}
