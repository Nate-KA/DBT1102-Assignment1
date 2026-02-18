package Hello;
import java.util.Scanner;
public class Patternloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
