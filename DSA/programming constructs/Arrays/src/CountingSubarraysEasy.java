import java.util.*;
public class CountingSubarraysEasy {
    public static void main(String[] args) {
        
    }
    public int solve(int[] A, int B) {
        int n=A.length;
        int maxsum= 0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=A[j];
                if(sum>maxsum && sum<B)
                count++;
            }
            
        }
        return count;
    }
}
