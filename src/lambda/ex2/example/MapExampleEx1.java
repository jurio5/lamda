package lambda.ex2.example;

import lambda.ex2.StringFunction;

import java.util.ArrayList;
import java.util.List;

public class MapExampleEx1 {

    public static final String ASTERISK = "***";

    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String> list, StringFunction func) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(func.apply(s));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);
        // 1. 대문자 변환
        List<String> toUpper = map(words, s -> s.toUpperCase());
        System.out.println("toUpper = " + toUpper);

        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        List<String> asterisk = map(words, s -> ASTERISK + s + ASTERISK);
        System.out.println("asterisk = " + asterisk);
    }
}