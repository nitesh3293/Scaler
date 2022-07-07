import java.util.*;
public class Subarraywithleastaverage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        A[i]=sc.nextInt();
        System.out.println("Enter the value of B:");
        int B = sc.nextInt();
        int index= solve(A,B);
        System.out.println("The index is : "+index);
        sc.close();
    }
    public static int solve(int[] A, int B) {
        int n=A.length;
        int res=0;
        double avg=1.0;
        double ans=Integer.MAX_VALUE;
        for(int i=0;i<=n-B;i++)
        {
            int sum=0;
            for(int j=i;j<i+B;j++)
            {
                sum+=A[j]; 
            } 
            System.out.println("Sum is : "+ sum);
            avg=sum/(double)B; 
            System.out.println("Avg is : "+avg);
            if(ans>avg)
            {
                ans=avg;
                res=i;
            }
        }
        return res;
    }
}
