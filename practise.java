import java.util.SortedSet;
import java.util.TreeSet;

public class practise {
    public static void main(String args[]) {
        // Creating an empty Set
        SortedSet<String> set = new TreeSet<String>();

        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        // Displaying the Set
        System.out.println("Set: " + set);

        // Removing elements using remove() method
        set.remove("Geeks");
        set.remove("4");
        set.remove("Welcome");

        // Displaying the Set after removal
        System.out.println("Set after removing elements: " + set);
    }
}

