package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M4MeasureTime {

    // 공통 : 실행 시간 측정 메서드
    public static void measure(Procedure p) {
        long startTime = System.nanoTime();

        p.run(); // 바뀌는 로직 실행 (익명 클래스 or 람다로 전달)

        long endTime = System.nanoTime();
        System.out.println("실행 시간: " + (endTime - startTime) + "ns");
    }

    public static void main(String[] args) {
        // 람다로 1부터 N까지 합 구하기
        measure(() -> {
            int N = 100;
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
            int total = sum;
            System.out.println("[1부터 100까지 합] 결과: " + total);
        });

        // 람다로 배열 정렬
        measure(() -> {
            int[] array = new int[4];
            int N = 3;

            for (int i = N; i >= 0; i--) {
                array[i] = array.length - i;
            }
            System.out.println("원본 배열: " + Arrays.toString(array));
            Arrays.sort(array);
            System.out.println("배열 정렬: " + Arrays.toString(array));
        });
    }
}
