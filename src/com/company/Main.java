package com.company;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(777);
        myList.add(8);
        myList.add(34);
        myList.add(555);
        myList.add(34);
        myList.add(176);
        myList.add(90);
        myList.add(73);
        myList.add(33);
        myList.add(55);
        myList.add(6);

     //   Stream<Integer> Stream = myList.stream();
        myList.stream()
                .distinct()
                .map((s) -> s + " ")
                .forEach((s) -> out.print(s));
        out.println();

        myList.stream()
                .filter((s) -> s > 10)
                .filter((s) -> s < 100)
                .filter((s) -> (s%2) ==0)
                .map((s) -> s + " ")
                .forEach((s) -> out.print(s));
        out.println();

        myList.stream()
                .map((s) -> (s*2))
                .map((s) -> s + " ")
                .forEach((s) -> out.print(s));
        out.println();

        myList.stream()
                .limit(4)
                .sorted()
                .map((s) -> s + " ")
                .forEach((s) -> out.print(s));
        out.println();
        out.println(myList.stream().count());



        OptionalDouble average = myList.stream()
                .mapToInt(e -> e)
                .average();
        if (average.isPresent())
        {
            System.out.print(average.getAsDouble());
        }



    }


}
