package com.java.sprint9.transient1;

import java.io.Serial;
import java.io.Serializable;

public class Example1 implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String regularString;
    private final transient String transientString;

    public Example1(String regularString, String transientString) {
        this.regularString = regularString;
        this.transientString = transientString;
    }

    @Override
    public String toString() {
        return "Example{" +
                "regularString='" + regularString + '\'' +
                ", transientString='" + transientString + '\'' +
                '}';
    }
}
