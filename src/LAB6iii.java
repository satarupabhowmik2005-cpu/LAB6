import java.util.Scanner;

// User Defined Exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

 class Main {

    // Method to check number
    static void ProcessInput(int num) throws NegativeNumberException {

        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        }

        System.out.println("Double value: " + (num * 2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        try {
            ProcessInput(num);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
