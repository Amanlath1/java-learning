public class userRegistration {
    public static void main(String args[]) {
        //TODO: Your code goes here
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";
        
        String username = firstName.toLowerCase() + lastName.toLowerCase();
        System.out.println("'username' after conversion and concatenation: " + username);

        System.out.println("'email' after replacing example.com with gmail.com: " + email.replace("example", "gmail"));

        System.out.println("index of @ in the email address is: " + email.indexOf('@'));
    }
}
