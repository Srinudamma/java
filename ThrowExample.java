public class ThrowExample {

    public static void main(String[] args) {
        try {
            validateAge(15); // Call a method that throws an exception if age is less than 18
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above!"); // Manually throw an exception
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}
