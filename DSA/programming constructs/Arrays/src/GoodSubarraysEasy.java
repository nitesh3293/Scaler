import java.util.*;
public class GoodSubarraysEasy {
    public static void main(String[] args) {
        
    }
    public int solve(int[] A, int B) {
        int n=A.length;
        int len=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=A[j];
                len =j-i+1;
                if(len%2==0 && sum<B )
                count++;

                else if(sum>B && len %2==1)
                count++;
            }
            
        }
        return count;
    }
}
