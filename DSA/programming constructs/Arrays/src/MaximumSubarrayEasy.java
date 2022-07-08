import java.util.*;
public class MaximumSubarrayEasy {
    public static void main(String[] args) {
        
    }
    public int maxSubarray(int A, int B, int[] C) {
        int maxsum= 0;
        for(int i=0;i<A;i++)
        {
            int sum=0;
            for(int j=i;j<A;j++)
            {
                sum+=C[j];
                if(sum>maxsum && sum<=B)
                maxsum=sum;
            }
            
        }
        return maxsum;
    }
}
