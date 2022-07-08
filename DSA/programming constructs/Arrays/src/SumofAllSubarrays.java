import java.util.*;
public class SumofAllSubarrays {
    public static void main(String[] args) {
        
    }
    public long subarraySum(int[] A) {
        long sum=0;
        long n=A.length;
        for(int i=0;i<n;i++)
        {
            sum+=(i+1)*(n-i)*A[i];
            
        }
        return sum;
    }
}
