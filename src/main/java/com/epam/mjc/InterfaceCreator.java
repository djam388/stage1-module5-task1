package com.epam.mjc;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {


        return x -> {
            String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            boolean everyWordStartsWithUpperCase = true;
            for (String s : x) {
                if (!uppercaseLetters.contains(s.substring(0, 1))) {
                    everyWordStartsWithUpperCase = false;
                }
            }
            return everyWordStartsWithUpperCase;
        };
//        throw new UnsupportedOperationException("You should implement this method.");


    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return x -> {
            List<Integer> array = new ArrayList<>();
            for (Integer integer : x) {
                if (integer % 2 == 0) {
                    array.add(integer);
                }
            }
            x.addAll(array);
        };
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Supplier<List<String>> filterCollection(List<String> values) {

        return () -> {
            List<String> correctValues = new ArrayList<>();
            for (String value : values) {
                if (value.substring(0, 1).equals(value.substring(0, 1).toUpperCase())
                    && value.endsWith(".")) {
                    StringTokenizer tokens = new StringTokenizer(value, " ");
                    if (tokens.countTokens() > 3) {
//                        System.out.println(value + " : " + tokens.countTokens());
                        correctValues.add(value);
                    }
                }
            }
//            System.out.println();
            return correctValues;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        Map<String, Integer> map = new HashMap<>();
        return x -> {
            for (String s : x) {
                map.put(s, s.length());
            }
            return map;
        };
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {

        return (list1, list2) -> {
            ArrayList<Integer> concatenated = new ArrayList<>();
            concatenated.addAll(list1);
            concatenated.addAll(list2);
            return  concatenated;
        };
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
