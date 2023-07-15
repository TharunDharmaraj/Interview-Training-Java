package recursion.basic;

class sumOfN {
    public static void main(String[] args) {
        System.out.println(sumOfNTerms(10));
        System.out.println(sumOfNTerms(10, 0));
    }

    // Functional Recursion
    private static int sumOfNTerms(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumOfNTerms(num - 1);
    }

    // Parameterized Way
    private static int sumOfNTerms(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        return sumOfNTerms(num - 1, sum + num);
    }
}