package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] strings = {"1-5,7,9-11", "1,3-7", "2", "3-10", "2-5,3,4-9"};
//        String[] strings = {"1,2,5", "3-5"};
        new Port(strings).getSequenceOfNumbers().forEach(x -> System.out.print(Arrays.toString(x)));
        System.out.println();
        List<int[]> list = new Port(strings).getSequenceOfNumbers();
        aaa(list.get(list.size() - 2), list.get(list.size() - 1));
    }

    static void aaa(int[] a, int[] b) {
        List<int[]> ab = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++)
                ab.add(new int[]{a[i], b[j]});
        }
        ab.forEach(x -> System.out.print(Arrays.toString(x)));
    }

}
