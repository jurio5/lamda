package lambda.ex2.example;

import lambda.ex2.StringFunction;

/*
1. 문자열을 입력받아, **새로운 함수를 반환**해주는
   `buildGreeter(String greeting)`라는 메서드를 작성하자.

   예) `buildGreeter("Hello")` → `"Hello"`를 사용하는 새로운 함수 반환

   새로운 함수는 입력받은 문자열에 대해
   `"Hello"(greeting) + ", " + (입력받은 문자열)` 형태로 결과를 반환

2. 함수를 반환받은 뒤에, 실제로 그 함수를 호출해 결과를 확인해보자.
*/
public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성
        return null; // 적절한 람다 반환
    }

    public static void main(String[] args) {
        // 코드 작성
    }
}