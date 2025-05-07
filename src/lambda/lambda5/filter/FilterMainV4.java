package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV4 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 짝수만 거르기
        System.out.println("짝수 = " + IntegerFilter.filter(numbers, x -> x % 2 == 0));
        // 홀수만 거르기
        System.out.println("홀수 = " + IntegerFilter.filter(numbers, x -> x % 2 != 0));

    }
}
