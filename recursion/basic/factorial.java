package recursion.basic;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }

    private static int fact(int i) {
        if(i == 0){
            return 1;
        }
        return i * fact(i - 1);
    }
}
