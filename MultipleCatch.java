public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Accessing an out-of-bounds index
            String str = null;
            System.out.println(str.length()); // Attempting to invoke a method on a null reference
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            // This catch block will catch any other exception that is not caught by the previous catch blocks
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}

