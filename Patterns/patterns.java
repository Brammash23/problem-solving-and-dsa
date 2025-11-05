import java.util.Scanner;

public class patterns {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);

        int a = Input.nextInt();
        int b= Input.nextInt();
        int c= Input.nextInt();

        if (a>b && a>c) {
            System.out.print(a);
        }
        else if(b>a && b>c)
        {
            System.out.print(b);
        }
        else
        {
            System.out.print(c);
        }
    }
}
