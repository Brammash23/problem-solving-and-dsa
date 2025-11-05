import java.util.Scanner;

class primeNumberorNot{
    public static void main(String [] args)
    {
        Scanner Input = new Scanner(System.in);
        int isPrimeNumber = Input.nextInt();
        boolean isPrime=true;
        int squareRoot=2;

        if (isPrimeNumber<2) {
            isPrime=false;
        }

        while (squareRoot * squareRoot >= isPrimeNumber) { 
            if (isPrimeNumber%squareRoot == 0) {
                isPrime=false;
                break;
            }
            
        }

        if (!isPrime) {
            System.out.println(isPrimeNumber + "this is Not a Prime Number");      
        }
        else
        {
            System.out.println(isPrimeNumber + "this is  a Prime Number");      
        }
    }

}