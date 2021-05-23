import java.util.Scanner;

public class ycmou_tut_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This program can understand vowel anc consonants");
        System.out.print("please enter any alphabet letter from 'A -Z': ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

            System.out.println(ch + " Is a vowel");
        else if (ch>= 'a' && ch<='z')
            System.out.println(ch + " Is a Consonant");
        else
            System.out.println(ch + "not an alphabet");
    }
}
