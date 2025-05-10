package stream.basic;

import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        // 스트림의 원본 리스트의 값은 바뀌지 않는다. (불변성 보장)
        List<Integer> originList = List.of(1, 2, 3, 4);
        System.out.println("originList = " + originList);

        List<Integer> filteredList = originList.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("filteredList = " + filteredList);
        System.out.println("originList = " + originList);

    }
}
