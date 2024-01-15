public class factorial {
    public static void main(String[] args) {
        // Initialize a number to some integer value
        int number = 5; // You can change this value as needed

        // Calculate and print the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Method to calculate factorial
    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
