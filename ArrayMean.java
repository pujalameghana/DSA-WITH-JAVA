import java.util.Scanner;

class AddLastDigitsFunction {
    int addLastDigits(int n1, int n2) {
               int lastDigit1 = Math.abs(n1) % 10;
        int lastDigit2 = Math.abs(n2) % 10;
                return lastDigit1 + lastDigit2;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
                System.out.println("Enter the first number:");
        int n1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int n2 = scanner.nextInt();
        
        // Create an object of AddLastDigitsFunction
        AddLastDigitsFunction obj = new AddLastDigitsFunction();
        
        // Call the addLastDigits method and print the result
        System.out.println(obj.addLastDigits(n1, n2));
        
        scanner.close();
    }
}
