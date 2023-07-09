package find extra char in string;

public class charCount {
    private static char findExtraCharacter(String s1, String s2) {
        int minCharCount = 0 ,maxCharCount = 0, int i;
        for(i = 0 ; i < s1.length() ; i++){
            minCharCount += s1.charAt(i);
            maxCharCount += s2.charAt(i);
        }
        maxCharCount += s2.charAt(i);
        int ch = maxCharCount - minCharCount;
        return (char)ch;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cbdae";
        char extraChar = findExtraCharacter(s1, s2);
        System.out.println("Extra character: " + extraChar);
    }
}
