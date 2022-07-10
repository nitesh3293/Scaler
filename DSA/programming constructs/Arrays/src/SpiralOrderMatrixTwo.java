import java.util.*;
public class SpiralOrderMatrixTwo {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the value of A:");
       int A= sc.nextInt();
       int[][] res= new int[A][A];
       res= generateMatrix(A);
       for(int i=0;i<A;i++)
       {
        for(int j=0;j<A;j++)
        {
            System.out.print(res[i][j]+ " ");
        }
        System.out.println();
       }
       sc.close(); 
    }
    public static int[][] generateMatrix(int A) {
        int[][] res= new int[A][A];

        int left=0;
        int right=A-1;
        int top=0;
        int down=A-1;
        int d=0;
        int k=1;
        int i,j;

        while((left<=right) && (top<=down))
        {
            if(d==0)
            {
                for(j = left; j <= right; j++)
                {
                    res[top][j]=k;
                    k++;
                }
                top++;
                d=1;                
            }
            
            else if(d==1)
            {
                for(i=top;i<=down;i++)
                {
                    res[i][right]=k;
                    k++;
                }
                right--;
                d=2;
            }
            else if(d==2)
            {
                for(j = right; j >= left; j--)
                {
                    res[down][j]=k;
                    k++;
                }
                down--;
                d=3;
                //k++;
            }
            else if(d==3)
            {
                for(i=down;i>=top;i--)
                {
                    res[i][left]=k;
                    k++;
                }
                left++;
                d=0;
            }
        }
        return res;/* 
        int[][] sol= new int[A][A];

        int left = 0;
        int right = A-1;
        int top = 0;
        int bottom = A-1;
        int dir = 0;
        int number = 1;
        int i, j;
    
        while((left <= right) && (top <= bottom))
        {
            if(dir == 0)
            {
                for(j = left; j <= right; j++)
                {
                    sol[top][j] = number;
                    number++;
                }
                top++;
                dir = 1;
            }
            else if(dir == 1)
            {
                for(i = top; i <= bottom; i++)
                {
                    sol[i][right] = number;
                    number++;
                }
                right--;
                dir = 2;
            }
            else if(dir == 2)
            {
                for(j = right; j >= left; j--)
                {
                    sol[bottom][j] = number;
                    number++;
                }
                bottom--;
                dir = 3;
            }
            else if(dir == 3)
            {
                for(i = bottom; i >= top; i--)
                {
                    sol[i][left] = number;
                    number++;
                }
                left++;
                dir = 0;
            }
        }
        return sol;*/
    }
}
