public class NumberCounter {
    public static int countNumbers(int num1, int num2, int num3, int num4, int num5, String type) {
        int count = 0;
        
        // Check the type and count accordingly
        if (type.equalsIgnoreCase("even")) {
            if (num1 % 2 == 0) count++;
            if (num2 % 2 == 0) count++;
            if (num3 % 2 == 0) count++;
            if (num4 % 2 == 0) count++;
            if (num5 % 2 == 0) count++;
        } else if (type.equalsIgnoreCase("odd")) {
            if (num1 % 2 != 0) count++;
            if (num2 % 2 != 0) count++;
            if (num3 % 2 != 0) count++;
            if (num4 % 2 != 0) count++;
            if (num5 % 2 != 0) count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        // Test the countNumbers method
        int num1 = 10;
        int num2 = -5;
        int num3 = 0;
        int num4 = 15;
        int num5 = -20;
        
        // Count even numbers
        int evenCount = countNumbers(num1, num2, num3, num4, num5, "even");
        System.out.println("Number of even numbers: " + evenCount);
        
        // Count odd numbers
        int oddCount = countNumbers(num1, num2, num3, num4, num5, "odd");
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
