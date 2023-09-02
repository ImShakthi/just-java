package com.imshakthi.justjava.functional;

import com.imshakthi.justjava.functional.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static com.imshakthi.justjava.functional.model.enums.Gender.FEMALE;
import static com.imshakthi.justjava.functional.model.enums.Gender.MALE;

public class Simple {

    BiFunction<Integer, Integer, Integer> incrFn = Integer::sum;

    Function<Integer, Integer> add = n -> n + 10;
    Function<Integer, String> nCat = n -> n + "10";
    Function<String, Integer> toString = Integer::valueOf;

    public void generate() {
        List<Person> people = List.of(new Person("Sakthivel", MALE), new Person("Eva", FEMALE));

        List<String> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender())) {
                females.add(person.name());
            }
        }
        System.out.println("List of females...");
        females.forEach(System.out::println);
        System.out.println("----------------------------");

        System.out.println("List of females...");
        people.stream().filter(person -> FEMALE.equals(person.gender())).forEach(System.out::println);
        System.out.println("----------------------------");
    }

    public int incrBy(final int number, final int incr) {

        System.out.println(add.andThen(nCat).andThen(toString).apply(number));

        return incrFn.apply(number, incr);
    }


}
