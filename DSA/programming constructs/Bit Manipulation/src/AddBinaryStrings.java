import java.util.*;

public class AddBinaryStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first binary no.:");
        String A=sc.nextLine();
        System.out.println("Enter second binary no.:");
        String B=sc.nextLine();
        String result="";
        result= addBinary(A,B);
        System.out.println("Result is "+result);
        sc.close();
        
    }
    public static  String addBinary(String A, String B) {
        int n=A.length();
        int m=B.length();
        int sum=0;
        String res="";

        if(A.charAt(0)=='0')
        return A;
        if(B.charAt(0)=='0')
        return B;
        
        while(n>0 || m>0 || sum>0)
        {
            sum+= ((n >= 0) ? A.charAt(n) - '0' : 0);
            sum += ((m >= 0) ? B.charAt(m) - '0' : 0);
            res=(sum%2)+res;
            sum/=2;

            n--;
            m--;
        }
        return res;
    }
}
