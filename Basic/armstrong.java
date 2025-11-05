import java.util.Scanner;

public class armstrong {
    	public static void main(String[] args) {
     Scanner Input = new Scanner(System.in);
	 int isArmStrongNumber=Input.nextInt();
     int isArm;
     int toValidate=isArm=isArmStrongNumber;
     int count=0;
     int rem=0;

     while (isArmStrongNumber>10) {
        isArmStrongNumber = isArmStrongNumber/10;
        count ++;
     }

     while (toValidate>0) {
        rem  += (toValidate % 10) * 3;
        toValidate = toValidate / 10;
     }
	}
}
