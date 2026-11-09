import java.util.Scanner;

class array
{
    public static void main()
    {
        
          int no = 0;
     Scanner scanner = new Scanner(System.in);
       no = scanner.nextInt();
       int Value  = 0;
     
      for(Value = 1; Value <= no; Value++)
      {
        if(no % Value == 0)
        {
         System.out.println("enter Even number");
        }
        else
        {

          System.out.println("enter the Odd number");
        }
      }


    }
}