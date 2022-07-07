import java.util.*;
public class evenSubArray {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the size of array:");
     int size= sc.nextInt();
     System.out.println("Enter the elements: ");
     int[] A= new int[size];
     for(int i=0;i<size;i++)
     A[i]=sc.nextInt();
     String str="";
     str=solve(A);
     System.out.println(str);
     sc.close();   
    }
    public static String solve(int[] A) {
        int n=A.length;
        if(n%2==1)
        return "NO";
        for(int i=0;i<n;i++)
        {
            if(A[0]%2==1 || A[n-1]%2==1)
            return "NO";
        }
        return "YES";        
    }
}
