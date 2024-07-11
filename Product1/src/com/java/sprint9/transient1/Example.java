package com.java.sprint9.transient1;

import java.io.Serial;
import java.io.Serializable;

public class Example implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final int regularInt;
    private final transient int transientInt;

    public Example(int regularInt, int transientInt) {
        this.regularInt = regularInt;
        this.transientInt = transientInt;
    }

    @Override
    public String toString() {
        return "Example{" +
                "regularInt=" + regularInt +
                ", transientInt=" + transientInt +
                '}';
    }
}
