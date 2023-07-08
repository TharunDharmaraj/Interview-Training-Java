// Link: https://www.geeksforgeeks.org/use-char-array-string-storing-passwords-java/
package OOPS;

public class charString {
    // Java program to illustrate preferring char[] arrays
    // over strings for passwords in Java
    public class PasswordPreference {

        public static void main(String[] args) {

            String strPwd = "password";
            char[] charPwd = new char[] { 'p', 'a', 's', 's', 'w', 'o', 'r', 'd' };

            System.out.println("String password: " + strPwd);
            System.out.println("Character password: " + charPwd);
        }
    }

}
