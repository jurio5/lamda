package lambda.ex2.example;

import lambda.ex2.MyReducer;

import java.util.List;

public class ReduceExampleEx1 {
    // 함수를 인자로 받아, 리스트 요소를 하나로 축약(reduce)하는 고차 함수
    public static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        int sum = initial;
        for (Integer i : list) {
            sum = reducer.reduce(sum, i);// 0 + 1 , 1 + 2 ~
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);
        // 1. 합 구하기 (초깃값 0, 덧셈 로직)
        int plus = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("plus = " + plus);
        // 2. 곱 구하기 (초깃값 1, 곱셈 로직)
        int multiple = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("multiple = " + multiple);
    }
}