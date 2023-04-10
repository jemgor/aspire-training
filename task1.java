package aspire.internship;

public class task1 {
    public static void main(String[] args) {
        //sum of even numbers
        //for loop
        int sumEven=0;
        for (int i=0;i<=100;i+=2){
            sumEven+=i;
        }
        System.out.println("Sum of even numbers: "+ sumEven);

        //while loop
        int sumOfEven=0, i=0;
        while (i<=100){
            sumOfEven+=i;
            i+=2;
        }
        System.out.println("sumOfEven using while = " + sumOfEven);

        //do while
        int EvenSum=0, y=0;
        do{
            EvenSum+=y;
            y+=2;
        }while (y<101);
        System.out.println("Even sum using do while = " + EvenSum);

        //*****************************************************************
        //odd numbers
        //for loop
        int sumOdd=0;
        for (int j=1;j<=100;j+=2){
            sumOdd+=j;
        }
        System.out.println("Sum of odd numbers using for loop: "+ sumOdd);

        //while loop
        int j=1, oddSum=0;
        while(j<100){
            oddSum+=j;
            j+=2;
        }
        System.out.println("oddSum using while = " + oddSum);

        //do while
        int sumOfOdd=0, x=1;
        do{
            sumOfOdd+=x;
            x+=2;
        }while (x<=100);
        System.out.println("Odd sum using do while = " + sumOfOdd);

        //***************************************************************
        // divisible by 7
        //do while
        int k = 0, sum7=0;
        do{
            if (k%7==0)
                sum7+=k;
            k++;
        }while (k<=100);
        System.out.println("sum of numbers div by 7 = " + sum7);

        //while loop
        int divSum=0, kk=0;
        while (kk<=100){
            if (kk%7==0)
                divSum+=kk;
            kk++;
        }
        System.out.println("divSum = " + divSum);

        //for loop
        int divBy7=0;
        for (int z=0;z<=100;z++){
            if (z%7==0)
                divBy7+=z;
        }
        System.out.println("div By 7 = " + divBy7);
    }
}
