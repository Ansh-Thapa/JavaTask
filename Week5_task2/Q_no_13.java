// Create a method to print the multiplication tables from 1 to 10
public class Q_no_13 {
    public static void mult( ){
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        mult();
    }
}
