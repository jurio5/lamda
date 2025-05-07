package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV5 {

    public static void main(String[] args) {
        // 숫자 사용 필터
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 짝수만 거르기
        System.out.println("짝수 = " + GenericFilter.filter(numbers, x -> x % 2 == 0));

        // 문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        System.out.println("문자 길이 = " + GenericFilter.filter(strings, x -> x.length() >= 2));

    }
}
