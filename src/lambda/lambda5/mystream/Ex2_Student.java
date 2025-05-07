package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex2_Student {

    public static void main(String[] args) {
        // 점수가 80점 이상인 학생의 이름을 추출
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<String> direct(List<Student> students) {
        List<String> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= 80) {
                result.add(student.getName());
            }
        }
        return result;
    }

    // 1. filter = 점수가 80점 이상인 학생들만 필터
    // 2. map = 필터링 된 학생 객체에서 이름만 추출
    private static List<String> lambda(List<Student> students) {
        List<Student> filter = GenericFilter.filter(students, x -> x.getScore() >= 80);
        List<String> result = GenericMapper.map(filter, s -> s.getName());
        return result;
    }
}
