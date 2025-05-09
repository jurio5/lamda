package methodref;

import java.util.function.Function;

public class MethodRefEx2 {

    public static void main(String[] args) {
        // 1. 정적 메서드 참조
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName;

        System.out.println("staticMethod1 = " + staticMethod1.apply("Kim"));
        System.out.println("staticMethod2 = " + staticMethod2.apply("Kim"));

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");
        Function<Integer, String> instanceMethod1 = x -> person.introduceWithNumber(x);
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;// 객체::인스턴스메서드

        System.out.println("instanceMethod1 = " + instanceMethod1.apply(3));
        System.out.println("instanceMethod2 = " + instanceMethod2.apply(3));

        // 3. 생성자 참조
        Function<String, Person> newPerson1 = name -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;

        System.out.println("newPerson1 = " + newPerson1.apply("Kim"));
        System.out.println("newPerson2 = " + newPerson2.apply("Kim"));
    }
}
