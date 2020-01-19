package com.day21.day21.title10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface MyAnn03 {
    String type();
    int[] intArr();
}
