package com.mypredicate.Topic1;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer i) {

        return i >= 0;
    }
}
