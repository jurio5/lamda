package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 짝수만 거르기
        Predicate<Integer> integerPredicate1 = x -> x % 2 == 0;
        System.out.println("짝수 = " + filter(numbers, integerPredicate1));
        // 홀수만 거르기
        Predicate<Integer> integerPredicate2 = x -> x % 2 != 0;
        System.out.println("홀수 = " + filter(numbers, integerPredicate2));

    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        ArrayList<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                filtered.add(number);
            }
        }
        return filtered;
    }
}
