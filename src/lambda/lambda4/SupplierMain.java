package lambda.lambda4;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        // 익명 클래스
        Supplier<Integer> supplier1 = new Supplier<>() {
            @Override
            public Integer get() {
                return new Random().nextInt(10) + 1;
            }
        };

        System.out.println("supplier.get() = " + supplier1.get());

        // 람다
        Supplier<Integer> supplier2 = () -> new Random().nextInt(10) + 1;
        System.out.println("supplier2.get() = " + supplier2.get());
    }
}
