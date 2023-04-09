package aspire.internship;

public class task1 {
    public static void main(String[] args) {
        //even numbers
        for (int i=0;i<=100;i+=2){
            System.out.println("Even Numbers: " + i);
        }

        //odd numbers
        int j=1;
        while(j<100){
            System.out.println("Odd Numbers: " + j);
            j+=2;
        }

        // divisible by 7
        int k = 0;
        do{
            if (k%7==0)
                System.out.println("Divisible by 7: "+ k);
            k++;
        }while (k<100);
    }
}
