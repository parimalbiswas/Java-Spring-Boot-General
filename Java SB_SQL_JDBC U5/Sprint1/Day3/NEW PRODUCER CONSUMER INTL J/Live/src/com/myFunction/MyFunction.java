package com.myFunction;

import java.util.function.Function;

public class MyFunction implements Function<StudentF, String> {
    @Override
    public String apply(StudentF s) {
        return s.getMark() > 500 ? "Pass" : "Fail";
    }
}
