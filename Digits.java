import   java.util.ArrayList;

public class Digits

{
 
    
   private ArrayList<Integer> digitList;    
 


    
   public Digits(int num)
   {
       digitList = new ArrayList<Integer>();
       int  x=num;
       
       if (num==0)
           digitList.add(new Integer (0));
       else   
       {
           
        }
        System.out.println(digitList);
    }

    public boolean isStrictlyIncreasing()
    {
        return true;
    }
  
}