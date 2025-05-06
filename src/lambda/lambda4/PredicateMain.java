package lambda.lambda4;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {
        // 익명 클래스
        Predicate<Integer> predicate1 = new Predicate<>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };

        System.out.println("predicate1.test(10) = " + predicate1.test(10));

        // 람다
        Predicate<Integer> predicate2 = value -> value % 2 == 0;
        System.out.println("predicate2.test(10) = " + predicate2.test(10));

        // Function 함수형 인터페이스를 통해서도 대체할 수 있음
        Function<Integer, Boolean> function = value -> value % 2 == 0;
        System.out.println("function.apply(10) = " + function.apply(10));
        // 그럼에도 predicate 함수형 인터페이스를 사용하는 이유는 의도의 분명함을 나타내기 위함
    }
}
