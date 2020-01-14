package com.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test4 {
    public static void main(String[] args) {

        ArrayList<Integer> coll=new ArrayList<>();
        Collections.addAll(coll,3,4,5,6,7);
        System.out.println(coll);
        Collections.sort(coll);
        System.out.println(coll);
    }
}
