public class MultipleChecker {
    public static int checkMultiple(int num1, int num2) {
        // Check if num1 is a multiple of num2
        if (num2 != 0 && num1 % num2 == 0) {
            return 1; // num1 is a multiple of num2
        } else {
            return 0; // num1 is not a multiple of num2
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        // Call the checkMultiple method and print the result
        int result = checkMultiple(num1, num2);
        if (result == 1) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
        
        scanner.close();
    }
}
