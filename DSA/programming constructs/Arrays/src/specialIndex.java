import java.util.*;;

public class specialIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int res;
        int[] A= new int[n];
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        res = solve(A);
        System.out.println("Special index are: "+res);
        sc.close();
    }
    public static int solve(int[] A) {
        int n=A.length;
        int[] podd= new int[n];
        int[] peven= new int[n];
        //int sume=0,sumo=0;
        peven[0]=A[0];
        podd[0]=0;
        for(int i=1;i<n;i++)
        {
            
            if(i%2==1)
            {
                //sumo+=A[i];
                podd[i]=podd[i-1]+A[i];
                peven[i]=peven[i-1];
            }
            else if(i%2==0)
            {
                //sume+=A[i];
                peven[i]=A[i]+peven[i-1];
                podd[i]=podd[i-1];
            }
        }
        /*for(int i: podd)
        System.out.println("podd: "+i);
        for(int i: peven)
        System.out.println("peven: "+i);*/
        int ans=0,toteven=0,totodd=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                toteven=podd[n-1]-podd[i];
                totodd=peven[n-1]-peven[i];
                if(toteven==totodd)
                ans++;
            }
            else
            //System.out.println(peven[i-1]+" "+podd[n-1]+" "+podd[i]);
            {
                toteven=peven[i-1]+podd[n-1]-podd[i];
                //System.out.println(podd[i-1]+" "+peven[n-1]+" "+peven[i]);
                totodd= podd[i-1]+peven[n-1]-peven[i];
                //System.out.println("At index : "+i+" value is: "+A[i]+" toteven : "+toteven+"   totodd: "+totodd);
                if(toteven==totodd)
                ans++;
            }
        }
        return ans;
    }
}
