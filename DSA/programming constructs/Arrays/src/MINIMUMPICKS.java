import java.util.*;
public class MINIMUMPICKS {
    public static void main(String[] args) {
        
    }
     public int solve(int[] A) {
        int n=A.length;
        int even=0;
        int odd=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(A[i]%2==0)
            {
                if(A[i]>even || even==0)
                even=A[i];
            }
            else{
                if(A[i]<odd|| odd==0)
                odd=A[i];
            }
        }
        res=even-odd;
        return res;
    }
}
