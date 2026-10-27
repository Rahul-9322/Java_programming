import java.util.Scanner;
class program61
{   

    public static void main(String A[])
    {
       Scanner scanner = new Scanner(System.in);
       int iValue = 0;
       System.out.println("Enter the frequency :");
       iValue = scanner.nextInt();
       Iteration iteration = new Iteration(); 
       iteration.Display(iValue);
    }
}

class Iteration
{
public  void Display(int iNo)
    {
       int icnt = 0;
       
       
       if(iNo < 0) 
       {
        iNo = -iNo;
       }
       for(icnt = 1; icnt <= iNo; icnt++)
       {
        System.out.println("-------------");
        System.out.println(icnt);
        System.out.println("-------------");
       }
    }
}