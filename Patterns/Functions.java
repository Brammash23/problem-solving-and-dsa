import java.util.Scanner;

public class Functions  {

    private static Scanner Input = new Scanner(System.in);
    public static void main(String [] args)
    {
        int a=20,b=30;
        // swapTwoNumbers(Input.nextInt(),Input.nextInt());
        swapTwoNumbers(a,b);
        System.out.print(a);
        System.out.print(b);

    }

    protected static void swapTwoNumbers(int num1,int num2)
    {
        num1 =num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        // System.out.print("The First Number After Swap:" + num1 +"The Number 2 After Swap" + num2);

    }
    
}
