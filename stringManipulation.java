public class stringManipulation {
    public static void main(String args[]) {
        String text = "Adventure";
        // TODO: Check the length using length() and print the length
        System.out.println(text.length());
        // TODO: Get the character at position 3 and print the character  
        System.out.println(text.charAt(2));      
        // TODO: Get a part of the String from position 1 to 4 and print the string
        System.out.println(text.substring(0,4));

        String anotherText= "Adventure";
        // TODO: Compare text with anotherText using equals() and print the output
        System.out.println(text.equals(anotherText));
        // TODO: Change to uppercase using toUpperCase() and print the converted string
        System.out.println(text.toUpperCase());
        // TODO: Change to lowercase using toLowerCase() and print the converted string
        System.out.println(text.toLowerCase());
        // TODO: Check if it contains "vent" using contains() and print the output
        System.out.println(text.contains("vent"));
        // TODO: Replace 'e' with 'a' and print the output
        System.out.println(text.replace('e','a'));
    }
}
