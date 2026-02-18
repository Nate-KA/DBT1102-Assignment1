package Hello;
import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = input.nextInt();
        int counter = 1;
        while (counter <= limit) {
            System.out.println(counter);
            counter++;
        }
    }
}
