public class Main {

    public static int fibCalc(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else  {
            return fibCalc(n - 1) + fibCalc(n - 2);
        }
    }

    public static void main(String[] args) {
//        System.out.println(fibCalc(5));
    }
}