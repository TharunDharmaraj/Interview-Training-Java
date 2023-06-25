public class notOptimal {
   public int fact(int num){
        if(num == 0){
            return 1;
        }
        return (num * fact(num-1));
    }
    public int[] repeatedNumber(int[] list) {
        int thisProd = 1;
        for(int i = 0; i < list.length;i++){
            thisProd *= list[i];
        }
        int len = list.length;
        int orgProd = fact(len);
        return CancelOutDivision(thisProd,orgProd);
    }
    
    public int[] CancelOutDivision(int a,int b) {
        int gcd = findGCD(a, b);
        int a1 = a / gcd;
        int b1 = b / gcd;
        int factor = 2;
        while (factor <= Math.min(a1, b1)) {
            if (a1 % factor == 0 && b1 % factor == 0) {
                a1 /= factor;
                b1 /= factor;
            } else {
                factor++;
            }
        }
        int[] arr = new int[2];
        arr[0] = a1;
        arr[1] = b1;
        return arr;
    }
    

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
