package lamda.start;

import java.util.Random;

public class Ex1Main {

    public static void helloDice() {
        long startNs = System.nanoTime();

        // 코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1; // 아마, 이러면 최소 값은 0이 아닌 1로 시작할 것임
        System.out.println("주사위 = " + randomValue);
        // 코드 조각 종료

        long endNs = System.nanoTime();
        System.out.println("실해 시간: " + (endNs + startNs) + "ns");
    }
}
