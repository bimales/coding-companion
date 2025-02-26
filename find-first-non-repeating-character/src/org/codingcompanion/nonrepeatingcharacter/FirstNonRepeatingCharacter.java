package org.codingcompanion.nonrepeatingcharacter;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    //abcnacn
    public static String findFirstNonRepeating(String str){
        Optional<Map.Entry<String, Long>> first = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() == 1)
                .findFirst();                ;

        return first.get().getKey();

    }

    public static void main(String[] args) {
        System.out.println("First Non Repeating Character : " +findFirstNonRepeating("abcnanbkilytrjlytr"));
    }

}
