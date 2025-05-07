package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV3 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> numbers = map(list, s1 -> Integer.valueOf(s1));
        System.out.println("numbers = " + numbers);
        
        // 문자열의 길이를 반환
        List<Integer> lengths = map(list, s -> s.length());
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String s : list) {
            result.add(mapper.apply(s));
        }
        return result;
    }
}
