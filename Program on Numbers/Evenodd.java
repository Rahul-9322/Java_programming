import java.util.Scanner;

class Evenodd
{
    public static void main()
    {
     Scanner scanner = new Scanner(System.in); 
     int iValue = 0;
     System.out.println("Enter the number");
     iValue = scanner.nextInt();
     if(iValue % 2==0)
  {
    System.out.println("It is Even Number");
  }
  else
    {
     System.out.println("It is Odd Number");
    }
   }
}

