import java.util.*;
public class secLargest {
    public static void main(String[] args) {
        
    }
    public int solve(int[] A) {
    if(A.length==1)
    return -1;
    int high=0;
    int second=0;
    for(int i=0;i<A.length;i++)
    {
        if(A[i]>=high)
        {
            second=high;
            high=A[i];
        }
        else if(A[i]>second)
        second=A[i];
    }
    return second;
    }
}
