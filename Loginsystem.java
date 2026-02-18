package Hello;
import java.util.Scanner;
public class Loginsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctID = 198820; // My Student Number
        String correctPass = "Strath123";
        int enteredID; String enteredPass;
        do {
            System.out.print("Enter Student Number: ");
            enteredID = input.nextInt();
            System.out.print("Enter Password: ");
            enteredPass = input.next();
        } while (enteredID != correctID || !enteredPass.equals(correctPass));
        System.out.println("Access Granted");
    }
}
