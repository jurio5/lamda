package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExample {
    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String> list, UnaryOperator<String> func) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            result.add(func.apply(str));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);
        // 1. 대문자 변환
        System.out.println("대문자 변환 : " + map(words, str -> str.toUpperCase()));
        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        System.out.println("*** 붙이기 : " + map(words, str -> "***" + str + "***"));
    }
}