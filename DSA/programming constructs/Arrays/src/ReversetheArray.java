import java.util.*;
public class ReversetheArray {
    public static void main(String[] args) {
        
    }
    public int[] solve(final int[] A) {
        int start=0;
        int end= A.length-1;
         while(start<end)
        {
            int temp= A[start];
            A[start]= A[end];
            A[end]= temp;
            start++;
            end--;
        }
        return A;
    }
}
