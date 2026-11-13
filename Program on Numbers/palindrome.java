import java.util.Scanner;

class palindrome
{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;
        int rev = 0;
        int set = 0;
        System.out.println("Enter the number :");
        iValue = scanner.nextInt();
        int original = iValue;
         while(iValue > 0)
         {
            set = iValue % 10;
            rev = (rev * 10) + set;
            iValue = iValue / 10;
         }
           if(original == rev)
            {
                System.out.println("It is a palindrome Number");
            }
            else
            {
                System.out.println("It is not a palindrome Number");
            }
         }
      }