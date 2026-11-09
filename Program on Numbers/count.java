import java.util.Scanner;

class count
{
    public static void main(String A[])
    {
        int hut = 0;
        int ret = 0;
        int cnt = 0; 
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        hut = obj.nextInt();
        while(hut != 0)
        {
            ret = hut % 10;
           hut = hut / 10;
          cnt++;
        }
        System.out.println("the count is "+cnt);
    }
   
}