import java.util.*;
public class Multipleleftrotationsofthearray {
    public static void main(String[] args) {
        
    }
    public int[][] solve(int[] A, int[] B) {
        int n=A.length;
        int m=B.length;
        int [][] res= new int[m][n];
        for(int i=0;i<B.length;i++)
        {
            int k=B[i];
            k=k%n;
            reverse(A,0,n-1);
            reverse(A,0,k-1);
            reverse(A,k,n-1);
        }
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[0].length;j++)
            {
                res[i][j]=A[j];
            }
        }
        return res;
    }
    public void reverse(int[] nums, int start, int end)
    {
        while(start<end)
        {
            int temp= nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}
