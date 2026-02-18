package Hello;

public class Blockstatements {
    public static void main(String[] args) {
        {
            int studentNumber = 198820; // My Student ID
            int secondValue = 50;
            int sum = studentNumber + secondValue;
            System.out.println("Sum inside block: " + sum);
        }
        // studentNumber is not accessible here (Demonstrates scope)
    }
}

