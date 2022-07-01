import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        
    }
    public int solve(int unit) {
double charge=0;
double bill=0;
int res;
if(unit>50)
    {
        charge=25;
        unit-=50;
        bill+=charge;
        if(unit>100)
        {
            unit-=100;
            charge=75;
            bill+=charge;
            if(unit>100)
            {
                unit-=100;
                charge=120;
                bill+=charge;
                if(unit>=1)
                {
                    charge=(unit*1.5);
                    bill+=charge;
                }
            }
            else
            {
                charge=(unit*1.2);
                bill+=charge;
            }
        }
        else
        {
            charge=(unit*0.75);
            bill+=charge;
        }
    }
    else
    {
        charge=(unit*0.5);
        //System.out.print(charge);
        bill+=charge;
        //System.out.print(bill);
    }
    bill= (bill*6)/5;
    //System.out.print(bill);
    res=(int)bill;
    return res;
}
}
