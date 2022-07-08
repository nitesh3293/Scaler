import java.util.*;
public class MaxSumContiguousSubarray {
    public static void main(String[] args) {
        
    }
    public int maxSubArray(final int[] A) {
        int maxsum= Integer.MIN_VALUE;
        int n=A.length;
        int psum=0;
        for(int i=0;i<n;i++)
        {
            psum+=A[i];

            if(psum>maxsum)
            maxsum=psum;

            if(psum<0)
            psum=0;
        }
        return maxsum;
    }
}
