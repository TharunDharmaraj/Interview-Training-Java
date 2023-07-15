package recursion.basic;

class printNTimes{
    public static void main(String[] args) {
        printN("Tharun",10,0);
    }

    private static void printN(String string, int times , int i) {
        if(i < times){
            System.out.println(string);
            i++;
            printN(string,times,i);
        }
        return;
    }
}