import java.util.Scanner;

class Member
{
    public Member(int iNo)
    {
        int ifact = 1;
        int icnt = 0;
       for(icnt = 1; icnt <= iNo; icnt++)
       {
         ifact = ifact * icnt;
       }
        System.out.println("the factorial is :"+ifact);
    }
}

class factorial
{
    public static void main(String A[])
    {
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        value = scanner.nextInt();
        Member member = new Member(value);
   
    }
}