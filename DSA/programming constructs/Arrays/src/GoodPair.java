import java.util.*;
public class GoodPair {
    public int solve(int[] A, int B) {
        int n=A.length;
        //int c=0;
        double d;
        d=(double)B;
        for(int i=0;i<n;i++)
        {
            //int a= A[i]%B;
            for(int j=i+1;j<n;j++)
            {
                //int e= A[j]%B;
                long e=A[i]+A[j];
                if(e/d==1.00)
                    return 1;
            }
        }
        return 0;
    }
}
