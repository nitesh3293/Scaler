import java.util.*;
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        
    }
    public int[] solve(int[] A) {
        int n=A.length;
        int product=1;
        for(int i=0;i<n;i++)
        {
            product*=A[i];
        }
        for(int i=0;i<n;i++)
        {
            A[i]=product/A[i];
        }
        return A;
    }
}
