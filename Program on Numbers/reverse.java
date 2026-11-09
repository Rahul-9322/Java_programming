import java.util.Scanner;

class Lous
{
    public static void main(String A[])
    {
        Scanner obj = new Scanner(System.in);
        int value = 0;
        int red = 0;
        int cnt = 0;
        System.out.println("Enter the number");
        value = obj.nextInt();
          
          while(value != 0)
          {
            red = value % 10;
            cnt =(cnt * 10)+red;
            value = value / 10;
          }
          System.out.println("the reversed number is "+cnt);
    }
    
}