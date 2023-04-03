//package org.example;
//
//import java.util.Arrays;
//
//public class rez {
//    Object[] getIndexesByNorm() {
//        StringBuilder builder = new StringBuilder();
//        for (String el : indexes) builder.append(el).append(",");
//
//        String[] str = builder.toString().split(",");
//
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].contains("-")) {
//                String[] s = str[i].split("-");
//                int min = Integer.parseInt(s[0]);
//                int max = Integer.parseInt(s[1]);
//                builder = new StringBuilder();
//                for (int j = min; j <= max; j++) builder.append(j < max ? j + "," : j);
//                str[i] = builder.toString();
//            }
//        }
//
//
//
//        String result = Arrays.toString(str).replaceAll(" ", "");
//        result = result.substring(1, result.length() - 1);
//
//        return Arrays.stream(result.split(","))
//                .distinct()
//                .map(Integer::valueOf)
//                .sorted()
//                .toArray();
//    }
//}
