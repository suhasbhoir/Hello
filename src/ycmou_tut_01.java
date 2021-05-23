import java.util.Scanner;

public class ycmou_tut_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        if (num>0) {
            System.out.println(num + " Greater than 0");
        }
        else if (num == 0) {
            System.out.println(num + " is equal to 0");
        }
        else {
            System.out.println(num + " negative number");
        }
    }

}
