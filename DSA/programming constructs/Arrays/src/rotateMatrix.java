import java.util.*;
public class rotateMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of 2-D square matrix: ");
        int n=sc.nextInt();
        int[][] A= new int[n][n];
        System.out.println("Enter the elements of the 2-D square matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }
        }
        solve(A);
        sc.close();
    }
    public static void solve(int[][] A) {
        int n=A.length;
        System.out.println("The original matrix is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                swap(A[i][j],A[j][i]);
            }
        }
        System.out.println("The matrix transpose is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }

        /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                swap()
            }
        }*/
    }
    public static void swap(int l, int m)
    {
        int temp=0;
        System.out.println("Before swap l:"+l+" & m: "+m);
        temp=l;
        l=m;
        m=temp;
        System.out.println("After swap l:"+l+" & m: "+m);
    }
}
