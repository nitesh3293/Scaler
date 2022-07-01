import java.util.*;
public class LittlePonnyandMaximumElement {
    public static void main(String[] args) {
        
    }
    public int solve(int[] A, int B) {
        int count=0;
        int num=0;
        for(int i=0;i<A.length;i++)
        {
            if(B==A[i])
            count=1;
        }
        if(count==1)
        {
            for(int i=0;i<A.length;i++)
            {
                if(B<A[i])
                num++;
            }
        if(num>0)
        return num;
        } 
        return -1;
    }
}
