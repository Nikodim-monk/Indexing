package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Port {
    private String[] indexes;

    public Port(String[] indexes) {
        this.indexes = indexes;
    }

    public List<int[]> getSequenceOfNumbers() {
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < indexes.length; i++) {
            String[] str = indexes[i].split(",");
            StringBuilder builder = new StringBuilder();
            for (String el : str) {
                if (el.contains("-")) {
                    String[] s = el.split("-");
                    for (int q = Integer.parseInt(s[0]); q <= Integer.parseInt(s[1]); q++)
                        builder.append(q).append(",");
                } else builder.append(el).append(",");
            }
            indexes[i] = builder.deleteCharAt(builder.length() - 1).toString();
            list.add(Arrays.stream(indexes[i].split(",")).mapToInt(Integer::parseInt).toArray());
        }
        return list;
    }



}

