package org.example;

import java.util.ArrayList;
import java.util.List;

public class PolymorphicExample {
    public static void main(String[] args) {
        List<Integer> int_list = new ArrayList<>();
        int_list.add(1);
        int_list.add(2);
        int_list.add(3);
        List<String> string_list = new ArrayList<>();
        string_list.add("a");
        string_list.add("b");
        head(int_list);
        head(string_list);
    }

    public static <T> T head (List<T> lst){
        System.out.println(lst.get(0));
        return lst.get(0);
    }
}
