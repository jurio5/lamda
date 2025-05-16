package functional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class CompositionMain1 {
    public static void main(String[] args) {
        // 1. x 를 입력받아 x * x 하는 함수
        UnaryOperator<Integer> square = x -> x * x;

        // 2. x 를 입력받아 x + 1 하는 함수
        UnaryOperator<Integer> add = x -> x + 1;

        // 함수 합성
        // 1. compose()를 사용한 새로운 함수 생성
        // 먼저 add 적용 후 square 적용하는 새로운 함수 newFunc1 ㅎ생성
        // square(add(2))
        Function<Integer, Integer> newFunc1 = square.compose(add);
        System.out.println("newFunc1 result = " + newFunc1.apply(2));

        // 2. andThen()을 사용한 새로운 함수 생성
        // 먼저 square 적용 후 add 적용하는 새로운 함수 newFunc2 생성
        // add(square(2))
        Function<Integer, Integer> newFunc2 = square.andThen(add);
        System.out.println("newFunc2 result = " + newFunc2.apply(2));
    }

}
