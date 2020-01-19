package com.day21.day21.title10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
public @interface MyAnno2 {
    String type() default "java";
}
