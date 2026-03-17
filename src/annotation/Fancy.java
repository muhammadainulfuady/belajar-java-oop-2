package annotation;

import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)

public @interface Fancy {
    String name();

    String[] tags() default {};
}