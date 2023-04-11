package aspire.internship;

public class task2 {
    public static void main(String[] args) {

        //sum of odds
        System.out.println("odd:" + sumOfOdd(1, 100, 0));
        System.out.println("odd:" + sumOfOdd(1, 50, 0));

        //sum of even
        System.out.println("even: " + sumOfEven(0, 100, 0));

        //dividable by 7
        System.out.println("div 7: " + divBy7(0, 100, 0));
    }

    public static int sumOfOdd(int init, int fin, int sum){
        return init>fin
                ? sum
                :sumOfOdd(init, fin-2, sum+fin) - (init*2-1);
    }

    public static int sumOfEven(int init, int fin, int sum){
        return init>fin
                ? sum
                : sumOfEven(init+2, fin, sum+init);
    }

    public static int divBy7(int start, int fine, int sum) {
        return start > fine
                ? sum
                :(start%7!=0? divBy7(start+1, fine, sum):divBy7(start+1, fine, sum+start));
    }
}
