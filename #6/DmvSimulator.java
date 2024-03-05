import java.util.Random;
public class DmvSimulator {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the DMV!");

        // Generate a random number between 1 and 200 for the user
        Random random = new Random();
        int userNumber = random.nextInt(200) + 1;
        System.out.println("Your number is: " + userNumber);
        System.out.println("Please wait until your number is called.");

        // Call out numbers until the user's number is called
        int currentNumber = 1;
        while (true) {
            // Check if the current number matches the user's number
            if (currentNumber == userNumber) {
                System.out.println("Your number (" + userNumber + ") has been called. Please proceed.");
                break;
            }

            // Print the current number and increment it
            System.out.println("Number " + currentNumber + " please come forward.");
            currentNumber++;

            // If current number exceeds 200, wrap around to 1
            if (currentNumber > 200)
                currentNumber = 1;
        }

        // Inform the user if they don't have required paperwork
        if (random.nextBoolean()) {
            System.out.println("Sorry, you don't have the required paperwork. Please come back with the necessary documents.");
        } else {
            System.out.println("You don't have the paperwork, get out and don't come back until you do!");
        }
    }
}
