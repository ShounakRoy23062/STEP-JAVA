public class NullPointerDemo {

    // Method that generates NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // Attempting to call length() method on a null object
        System.out.println(text.length());
    }

    //Method to demonstrate handling NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        //Calling the method to generate NullPointerException
        System.out.println("Calling method to generate NullPointerException:");
        try {
            generateNullPointerException()
        } catch (NullPointerException e) {
            System.out.println("Caught in main (generated exception): " + e);
        }
        System.out.println("\nCalling method to handle NullPointerException:");
        handleNullPointerException();
    }
}



