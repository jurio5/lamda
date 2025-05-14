package defaultmethod.ex2;

import java.time.LocalDateTime;

public interface Notifier {
    // 알림을 보내는 기능
    void notify(String message);

    // 신규 기능 추가
    default void scheduleNotification(String message, LocalDateTime scheduleTime) {
        System.out.println("[기본 스케줄링] message : " + message + ", time : " + scheduleTime);
    }

    // 예시 (이러한 사용 방식은 가능하나, 상태가 변하는 방식은 지양하라)
    // interface 는 static final 성질을 가지고 있고, 여기서 인스턴스 변수를 선언하여 이 값을 디폴트 메서드에서 바꾼다던가
    // 이러한 식으로 상태 변화가 이루어지는 방식은 지양하라는 뜻
    default int plus(int a, int b) {
        return a + b;
    }
}
