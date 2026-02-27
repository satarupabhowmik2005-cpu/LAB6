 class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        try {
            int a = 10;   // Operand 1
            int b = 0;    // Operand 2 (division by zero)

            int result = a / b;   // This will cause ArithmeticException
            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }

        finally {
            System.out.println("Finally block executed");
        }
    }
}