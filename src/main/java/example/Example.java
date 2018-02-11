package example;

import com.google.common.base.Joiner;

public class Example {
    private Example() {
        throw new IllegalStateException("Utility class");
    }

    public static String join(String... args) {
        return Joiner.on(' ').join(args);
    }
}
