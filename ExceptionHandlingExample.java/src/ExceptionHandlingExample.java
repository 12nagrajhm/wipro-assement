public class ExceptionHandlingExample {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NullPointerException handling.");
        }

        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after ArrayIndexOutOfBoundsException handling.");
        }

        System.out.println("Program execution continues...");
    }
}