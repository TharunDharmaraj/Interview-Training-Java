package recursion.basic;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPali("tha",0));
    }

    private static boolean isPali(String string,int i) {
        if(i > string.length() / 2){
            return true;
        }
        if(string.charAt(i) != string.charAt(string.length() - i - 1)){
            return false;
        }
        return isPali(string, i+1);
    }
}
