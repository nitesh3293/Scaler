import java.util.*;
public class rangeSumQuery {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        long[] ans = new long[n];
        int[] A= new int[n];
        System.out.println("Enter the Elements: ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the total no.of Query:");
        int m=sc.nextInt();
        int[][] B =new int[m][2];
        System.out.println("Enter the start and end of query:");
        for(int i=0;i<m;i++)
        {
            for(int j=0; j<2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            ans=rangeSum(A,B);
        }
        for(long i: ans)
        System.out.println(i);
        sc.close();
    }
    public static long[] rangeSum(int[] A, int[][] B) {
        int n=A.length;
        int m= B.length;
        long[] pfsum= new long[m];
        long[] res= new long[m];
        int s=0,e=0;
        pfsum[0]=A[0];
        for(int i=1;i<n;i++)
        {
            pfsum[i]=pfsum[i-1]+A[i];
        }
        //for(int i: pfsum)
        //System.out.println("pfsum: "+i);
        for(int i=0;i<m;i++)
        {
            s=B[i][0];
            //s=s-1;
            e=B[i][1];
            //e=e-1;
            long sum=0;
            if(s==0)
            sum=pfsum[e];
            else
            {
                for(int k=s;k<=e;k++)
                {
                    sum=(pfsum[e])-(pfsum[s-1]);
                }
            }
            res[i]=sum;
        }
        return res;
    }
}