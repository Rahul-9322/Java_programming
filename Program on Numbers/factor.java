import java.util.Scanner;

class factor
{
    public static void main(String[] args) 
    {
         int iValue = 0;
         int ret = 1;
        
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter number");
         iValue = obj.nextInt();
        
         while(ret <= iValue)
            {
               if(iValue % ret == 0)
                   {
                    System.out.println("the factor is :"+ret);
                    
                   }
                   ret++;
         
             }
        
    }

}