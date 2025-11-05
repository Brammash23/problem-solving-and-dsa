package Striver;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int cnt = countDigits(Input.nextInt());
        System.out.println("the count of Digits:" + cnt);
    }

    public static int countDigits(int num)
    {
       if (num != 0) {
            int cnt = (int)(Math.log10(num)) + 1; 
            return cnt;
        }
        return 1; 
    }
    
}
