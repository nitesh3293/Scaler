import java.util.*;
public class ClosestMinMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int res=0;
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of this array: ");
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        res=solve(A);
        System.out.println("The shoetest distance is: "+res);
        sc.close();
    }
    public static int solve(int[] A) {
        if(A.length==1)
        return 1;

        int n=A.length;
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
         for(int i=0;i<n;i++)
         {
             if(A[i]<min)
             min=A[i];
             if(A[i]>max)
             max=A[i];
         }
         System.out.println("Max: "+max+" Min: "+min);
         if(max==min)
         return 1;

         int cmin=-1;
         int cmax=-1;
         int ans=n+n;
         for(int i=n-1;i>=0;i--)
         {
             if(A[i]==min)
             {
                 cmin=i;
                 if(cmax!=-1)
                 ans=Math.min(ans,cmax-cmin+1);
             }

              else if(A[i]==max)
              {
                  cmax=i;
                  if(cmin!=-1)
                  ans=Math.min(ans,cmin-cmax+1);
              }
         }
         return ans;
    }
}
