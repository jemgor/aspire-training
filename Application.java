package aspire.internship.evaluation;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//array of int that returns three groups
//1: numbers less than 5 2: numbers >=5 or <10 3: number equal 10
public class Application {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,9,15,22};
        List<Integer> lessThan5 = new ArrayList<>();
        List<Integer> between5and10 = new ArrayList<>();
        List<Integer> greaterOrEqual10 = new ArrayList<>();
        //int[] num = new int[5];


        for (int i : arr){
            if(i<5){
                lessThan5.add(i);
            } else if (i>=5 && i<10) {
                between5and10.add(i);
            } else if (i>=10) {
                greaterOrEqual10.add(i);
            }
        }

        System.out.println("lessThan5 = " + lessThan5);
        System.out.println("between5and10 = " + between5and10);
        System.out.println("greaterOrEqual10 = " + greaterOrEqual10);


        //        System.out.println("between 5 and 10:   " + Arrays.stream(arr)
//                .filter(value -> { return value >= 5 && value < 10;})
//                .boxed().toList());
//        System.out.println("greater or equal 10:    " + Arrays.stream(arr)
//                .filter(value -> value >= 10)
//                .boxed().toList());

//        System.out.println(
//                Arrays.stream(arr)
//                .filter(value -> {
//                    if (value < 5) {
//                        return true;
//                    } else if (value >= 5 && value < 10) {
//                        return true;
//                    } else if (value >= 10) {
//                        return true;
//                    }
//                    return false;
//                })
//                .boxed()
//                .toList());

        System.out.println(Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(value -> {
                    if (value < 5) {
                        return "\n Less than 5\t";
                    } else if (value >= 5 && value < 10) {
                        return "\nBetween 5 and 10\t";
                    } else if (value >= 10) {
                        return "\nGreater or equal to 10\t";
                    }
                    return false;
                })));
    }
}
