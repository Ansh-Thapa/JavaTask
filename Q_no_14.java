// Write a program that prints all even numbers from 1 to 100 using for loop.
package Week3_task1;
public class Q_no_14 {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100 are: ");
        for (int i=1; i<=100; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
