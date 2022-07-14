import java.util.*;
public class starPatternOne {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of pattern : ");
       /*  int n=sc.nextInt();
        int row= 2*n;
        for(int i=0;i<row;i++){
            int col= i>=n?row-i-1:i;
            for(int j=1;j<=n-col;j++){
                System.out.print("*");
            }
// for space
            for(int j=0;j<2*col;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-col-1;j++){
                System.out.print("*");
            }


            System.out.println();
        }*/
        int n=sc.nextInt();
        for(int i=0;i<2*n;i++)
        {
            if(i<n)
            {
                for(int j=0;j<n;j++)
                {
                    if(j<n-i)
                        System.out.print("*");
                    else 
                        System.out.print(" ");
                }
                for(int j=n;j<2*n;j++)
                {
                    if(i>j-n)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            if(i>n-1 && i<2*n)
            {
                for(int j=0;j<n;j++)
                {
                    if(i-n<j)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                for(int j=n;j<2*n;j++)
                {
                    if(i+j<3*n-1)
                        System.out.print(" ");
                    else 
                        System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
