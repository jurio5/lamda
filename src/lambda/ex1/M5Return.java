package lambda.ex1;

import lambda.MyFunction;

public class M5Return {

    public static MyFunction getOperation(String operator) {
        return switch (operator) {
            case "add" -> (a, b) -> a + b;
            case "sub" -> (a, b) -> a - b;
            default -> (a, b) -> 0; // 잘못 된 연산자일 경우 0을 반환
        };
    }

    public static void main(String[] args) {
        System.out.println("add(1, 2) = " + getOperation("add").apply(1,2));
        System.out.println("sub(1, 2) = " + getOperation("sub").apply(1,2));
        System.out.println("xxx(1, 2) = " + getOperation("xxx").apply(1,2));
    }
}
