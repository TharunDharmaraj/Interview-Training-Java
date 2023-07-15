package recursion.basic;

public class print1toN {

    public static void print1N(int start, int num) {
        if (start > num) {
            return;
        }
        System.out.println(start);
        print1N(++start, num);        
        // print1N(start++, num); // Error
    }

        public static void main(String[] args) {
            print1N(1,10);
        }
}
