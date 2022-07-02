import java.util.*;
public class EquilibriumIndexOfAnArray {
    public static void main(String[] args) {
        
    }
    public int solve(int[] A) {
        int rsum=0;
        int lsum=0;
        int res=-1;
        for(int i: A)
            rsum+=i;
        for(int i=0;i<A.length;i++)
        {
            rsum-=A[i];
            if(rsum==lsum)
            res=i;
            else
            lsum+=A[i];
        }
        return res;
    }
}
