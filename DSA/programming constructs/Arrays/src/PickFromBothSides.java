import java.util.*;
public class PickFromBothSides {
    public static void main(String[] args) {
    
    }   
    public int solve(int[] A, int B) {
        int n = A.length;
        int sumF=0,res=0;
        for(int i=0;i<B;i++)
        {
            sumF+=A[i];
        }
        res=sumF;
        int l=B-1,r=n-1;
        while(l>=0)
        {
            sumF-=A[l];
            sumF+=A[r];
            l--;
            r--;
            
            if(sumF>res)
            res=sumF;
        }    
        return res;
    }
}
