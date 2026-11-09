import java.util.Scanner;

class Sum
{
    public int Sum(int no)
    {
       int cls = 0;
      
       int Sum = 0;
       
       
       while(no != 0)
        {
            cls = no % 10;
            Sum = Sum + cls;
            no = no / 10;
            
        }  
        return Sum;
    }

}

class Average
{
    public static void main(String A[])
    {
      Scanner scanner = new Scanner(System.in);
      int set = 0;
       Sum sum = new Sum();
      System.out.println("Enter the number");
        set = scanner.nextInt();

       set = sum.Sum(set);
      System.out.println("Summation of digits is "+set);

    }
}