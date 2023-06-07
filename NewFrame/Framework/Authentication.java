package etu2663.framework;

import java.lang.annotation.*;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Authentication {
    String profile() default "";
}
