package Hello;
import java.util.Scanner;
public class Ifstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in feet: ");
        double height = input.nextDouble();

        if (height >= 6.0) {
            System.out.println("Tall");
        } else if (height >= 5.58) {
            System.out.println("Average");
        } else {
            System.out.println("Short");
        }
    }
}
