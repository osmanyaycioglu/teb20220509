package com.teb.training.java.se8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class MyList<T> {

    private List<T> list = new ArrayList<>();

    public MyList<T> add(T t) {
        list.add(t);
        return this;
    }

    public MyList<T> addAll(T... t) {
        for (T tLoc : t) {
            list.add(tLoc);
        }
        return this;
    }

    public MyList<T> distinct() {
        Set<T> setLoc = new HashSet<>();
        for (T t : list) {
            setLoc.add(t);
        }
        list = new ArrayList<>(setLoc);
        return this;
    }

    public MyList<T> sorted(Comparator<T> comparableParam) {
        Collections.sort(list,
                         comparableParam);
        return this;
    }

    public MyList<T> filter(Predicate<T> predicate) {
        List<T> tList = new ArrayList<>();
        for (T tLoc : list) {
            if (predicate.test(tLoc)) {
                tList.add(tLoc);
            }
        }
        list = tList;
        return this;
    }

}
