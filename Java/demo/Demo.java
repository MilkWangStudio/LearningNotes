package com.milkwang.cupid.domain.po;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (Integer i : list) {
            list.add(10);
        }
    }
}
