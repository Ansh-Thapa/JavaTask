// Take a character input and use switch to display if it is a vowel (a, e, i, o, u).
package Week3_task1;
import java.util.Scanner;
public class Q_no_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any alphabet you want: ");
        char ch = sc.next().charAt(0);
        sc.close();
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
        }
    }
}
