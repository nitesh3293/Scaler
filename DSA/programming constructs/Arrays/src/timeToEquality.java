import java.util.*;
public class timeToEquality {
    public static void main(String[] args) {
        
    }
    public int solve(int[] A) {
        int n =A.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(A[i]>max)
            max=A[i];
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            count+=(max-A[i]);
        }
        return count;
    }
}
