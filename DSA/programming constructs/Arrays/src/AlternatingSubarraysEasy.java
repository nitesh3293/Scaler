import java.util.*;
public class AlternatingSubarraysEasy {
    public static void main(String[] args) {
        
    }
    public int[] solve(int[] A, int B) {
        int n=A.length;
        ArrayList<Integer> res= new ArrayList<>();
        
        for(int i=B;i<n-B;i++)
        {
            boolean sign=true;
            for(int j=i-B;j<i+B;j++)
                if(A[j]==A[j+1])
                {
                    sign=false;
                    break;
                }            
            if(sign)
            {
                res.add(i);
            }
        }
        int[] ans= new int[res.size()];
        for(int i=0;i<res.size();i++)
            ans[i]=res.get(i);
        return ans;
    }
}
